/*******************************************************************************
 * Copyright (c) 2010 Jesper S Moller and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Jesper S Moller - initial API and implementation 
 *******************************************************************************/
package org.eclipse.wst.xml.xpath2.processor.test;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.wst.xml.xpath2.processor.DefaultEvaluator;
import org.eclipse.wst.xml.xpath2.processor.DynamicContext;
import org.eclipse.wst.xml.xpath2.processor.DynamicError;
import org.eclipse.wst.xml.xpath2.processor.Evaluator;
import org.eclipse.wst.xml.xpath2.processor.ast.XPath;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class TestPerformance extends AbstractPsychoPathTest {

	private static final String COUNT = "count";
	private static final double FUDGE_FACTOR = 1.8;
	private static boolean CHATTY = true;
	
	private final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	{
		factory.setNamespaceAware(true);
	}

	interface DocBuilder {
		Document createDocument(int complexity) throws ParserConfigurationException;
	}

	public void testLinearPerformance() throws Exception {
		checkPerformance("count(for $elem in //* return 'hej')", 1, 1000, 15, new DocBuilder() {
			
			public Document createDocument(int complexity) throws ParserConfigurationException {
				Document document = factory.newDocumentBuilder().newDocument();

				Element root = document.createElementNS("urn:x-root","xr:Root");
				int count = 1;
				document.appendChild(root);
				for (int i = 0; i < complexity; ++i) {
					Element child = root.getOwnerDocument().createElementNS("urn:x-child-" + (i%5+1), "c"+(i%5+1) + ":UpperChild" + (i+1));
					root.appendChild(child);
					count += addChildren(child, 3) + 1;
				}
				document.setUserData(COUNT, count, null);
				return document;
			}
		});
	}

	public void testDeepPerformance() throws Exception {
		checkPerformance("count(for $elem in //* return 'hej')", 0, 1000, 15, new DocBuilder() {
			
			public Document createDocument(int complexity) throws ParserConfigurationException {

				factory.setNamespaceAware(true);
				Document document = factory.newDocumentBuilder().newDocument();
				
				Element root = document.createElementNS("urn:x-root","xr:Root");
				document.appendChild(root);
				int count = 1;
				Element current = root;
				for (int i = 0; i < complexity; ++i) {
					Element child = root.getOwnerDocument().createElementNS("urn:x-child-" + (i%5+1), "c"+(i%5+1) + ":UpperChild" + (i+1));
					current.appendChild(child);
					count += addChildren(child, 2) + 1;
					current = child;
				}

				document.setUserData(COUNT, count, null);
				return document;
			}
		});
	}
	
	public void testExplosivePerformance() throws Exception {
		checkPerformance("count(for $elem in //* return 'hej')", 2, 11, 1, new DocBuilder() {
			
			public Document createDocument(int complexity) throws ParserConfigurationException {

				factory.setNamespaceAware(true);
				Document document = factory.newDocumentBuilder().newDocument();
				
				Element root = document.createElementNS("urn:x-root","xr:Root");
				document.appendChild(root);
				int count = addChildren(root, complexity);

				document.setUserData(COUNT, count+1, null);
				return document;
			}
		});
	}
	
	public void checkPerformance(String xpath, int low, int high, int step, DocBuilder builder) throws Exception {
		DynamicContext dc = setupDynamicContext(null);

		XPath path = compileXPath(dc, xpath);
		Document smallDoc = builder.createDocument(low);
		int referenceNodeCount = (Integer)smallDoc.getUserData(COUNT);
		long time = timeEvaluation(dc, path, smallDoc, referenceNodeCount);
		StringBuilder sb = new StringBuilder();
		
		log(sb, "First iteration " + time + " 탎 for " + referenceNodeCount + " nodes");
		long timePerComplexity = (long)(FUDGE_FACTOR  * time / referenceNodeCount);
		log(sb, "Expected bound of " + timePerComplexity + " 탎 per unit");

		int violations = 0;
		for (int i = low + 1; i <= high; i+=step) {
			Document compareDoc = builder.createDocument(i);
			int nodeCount = (Integer)compareDoc.getUserData(COUNT);
			if (CHATTY) {
				System.out.println("Complexity " + i + " (going to " + high + "): Trying " + nodeCount + " nodes");
			}
			long measured = timeEvaluation(dc, path, compareDoc, nodeCount);
			
			long actualTime = measured / nodeCount;
			if (CHATTY) {
				System.out.println("At " + nodeCount + " units, time per unit " + actualTime + " 탎");
			}
			if (actualTime > timePerComplexity) {
				log(sb, "At " + nodeCount + " units, the time per unit " + actualTime + " 탎 was too high, indicating non-linear complexity");
				if (++violations >= 3) {
					fail(sb.toString());
				}
			}
		}
	}
	
	private void log(StringBuilder sb, String string) {
		if (CHATTY) {
			System.out.println(string);
		}
		sb.append(string).append("\n");
		
	}

	private long timeEvaluation(DynamicContext dc, XPath path, Document bigDoc, long expected)
			throws DynamicError {
		long before = System.nanoTime();
		Evaluator eval = new DefaultEvaluator(dc, bigDoc);
		String count = eval.evaluate(path).first().string_value();
		assertEquals(""+expected, count);
		long after = System.nanoTime();
		return (after-before) / 1000;
	}
	
	/**
	 * Constructs a tree of equal depth and number of children
	 * 
	 * @param parent Element to add children to
	 * @param depth Desired depth
	 * @return number of nodes created
	 */
	private int addChildren(Element parent, int depth) {
		int count = 0;
		for  (int i = 0; i < depth*2; ++i) {
			count++;
			Element child = parent.getOwnerDocument().createElementNS("urn:x-child-" + (i+1), "c"+(i+1) + ":Child" + (i+1));
			parent.appendChild(child);
			count += addChildren(child, depth-2);
		}
		return count;
	}
	
	public static void main(String[] args) throws Exception {
		TestPerformance tp = new TestPerformance();
		tp.setUp();
		try {
			tp.testLinearPerformance();
//			tp.testDeepPerformance();
		} catch (Exception e) {
			// Boom
		}
		tp.tearDown();
	}
}
