
/*******************************************************************************
 * Copyright (c) 2009 Standards for Technology in Automotive Retail and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David Carver - STAR - initial api and implementation bug 262765 
 *******************************************************************************/
package org.eclipse.wst.xml.xpath2.processor.testsuite.functions;

import java.net.URL;

import org.apache.xerces.xs.XSModel;
import org.eclipse.wst.xml.xpath2.processor.*;
import org.eclipse.wst.xml.xpath2.processor.ast.XPath;
import org.eclipse.wst.xml.xpath2.processor.internal.Focus;
import org.eclipse.wst.xml.xpath2.processor.test.AbstractPsychoPathTest;
      
      
public class BaseURIFuncTest extends AbstractPsychoPathTest {

	//PsychoPath will always have a context.
//   //Evaluates the "base-uri" function with no arguments and no context node set. Should raise runtime error.
//   public void test_fn_base_uri_1() throws Exception {
//      String inputFile = "/TestSources/emptydoc.xml";
//      String xqFile = "/Queries/XQuery/Functions/AccessorFunc/BaseURIFunc/fn-base-uri-1.xq";
//      String expectedResult = "XPDY0002";
//      URL fileURL = bundle.getEntry(inputFile);
//      loadDOMDocument(fileURL);
//      
//      // Get XML Schema Information for the Document
//      XSModel schema = getGrammar();
//
//      DynamicContext dc = setupDynamicContext(schema);
//
//      String xpath = "fn:base-uri()";
//      String actual = null;
//      try {
//	   	  XPath path = compileXPath(dc, xpath);
//	
//	      Evaluator eval = new DefaultEvaluator(dc, domDoc);
//	      
//	      ResultSequence rs = eval.evaluate(path);
//         
//          actual = buildResultString(rs);
//	
//      } catch (XPathParserException ex) {
//    	 actual = ex.code();
//      } catch (StaticError ex) {
//         actual = ex.code();
//      } catch (DynamicError ex) {
//         actual = ex.code();
//      }
//
//      assertEquals("XPath Result Error " + xqFile + ":", expectedResult, actual);
//        
//
//   }

   //Evaluates the "base-uri" function with argument set to the empty sequence.
   public void test_fn_base_uri_3() throws Exception {
      String inputFile = "/TestSources/emptydoc.xml";
      String xqFile = "/Queries/XQuery/Functions/AccessorFunc/BaseURIFunc/fn-base-uri-3.xq";
      String resultFile = "/ExpectedTestResults/Functions/AccessorFunc/BaseURIFunc/fn-base-uri-3.txt";
      String expectedResult = getExpectedResult(resultFile);
      URL fileURL = bundle.getEntry(inputFile);
      loadDOMDocument(fileURL);
      
      // Get XML Schema Information for the Document
      XSModel schema = getGrammar();

      DynamicContext dc = setupDynamicContext(schema);

      String xpath = extractXPathExpression(xqFile, inputFile);
      String actual = null;
      try {
	   	  XPath path = compileXPath(dc, xpath);
	
	      Evaluator eval = new DefaultEvaluator(dc, domDoc);
	      ResultSequence rs = eval.evaluate(path);
         
          actual = buildResultString(rs);
	
      } catch (XPathParserException ex) {
    	 actual = ex.code();
      } catch (StaticError ex) {
         actual = ex.code();
      } catch (DynamicError ex) {
         actual = ex.code();
      }

      assertEquals("XPath Result Error " + xqFile + ":", expectedResult, actual);
        

   }

   // Psychopath will always have a context item.
//   //Evaluates the "base-uri" function with argument set to "." and no context node set. Should raise runtime error.
//   public void test_fn_base_uri_22() throws Exception {
//      String inputFile = "/TestSources/emptydoc.xml";
//      String xqFile = "/Queries/XQuery/Functions/AccessorFunc/BaseURIFunc/fn-base-uri-22.xq";
//      String resultFile = "/ExpectedTestResults/Functions/AccessorFunc/BaseURIFunc/";
//      String expectedResult = getExpectedResult(resultFile);
//      URL fileURL = bundle.getEntry(inputFile);
//      loadDOMDocument(fileURL);
//      
//      // Get XML Schema Information for the Document
//      XSModel schema = getGrammar();
//
//      DynamicContext dc = setupDynamicContext(schema);
//
//      String xpath = extractXPathExpression(xqFile, inputFile);
//      String actual = null;
//      try {
//	   	  XPath path = compileXPath(dc, xpath);
//	
//	      Evaluator eval = new DefaultEvaluator(dc, domDoc);
//	      ResultSequence rs = eval.evaluate(path);
//         
//          actual = buildResultString(rs);
//	
//      } catch (XPathParserException ex) {
//    	 actual = ex.code();
//      } catch (StaticError ex) {
//         actual = ex.code();
//      } catch (DynamicError ex) {
//         actual = ex.code();
//      }
//
//      assertEquals("XPath Result Error " + xqFile + ":", expectedResult, actual);
//        
//
//   }

}
      