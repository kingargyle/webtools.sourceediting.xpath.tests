package org.eclipse.wst.xml.xpath2.processor.testsuite;

import org.eclipse.wst.xml.xpath2.processor.testsuite.core.AllW3CCoreTests;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.AllW3CDateTests;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.AllW3CFunctionTests;
import org.eclipse.wst.xml.xpath2.processor.testsuite.numeric.AllW3CNumericTests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllW3CXPath20Tests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"All W3C XPath 2.0 Test Suites");
		//$JUnit-BEGIN$
		suite.addTest(AllW3CCoreTests.suite());
		suite.addTest(AllW3CDateTests.suite());
		suite.addTest(AllW3CFunctionTests.suite());
		suite.addTest(AllW3CNumericTests.suite());
		//$JUnit-END$
		return suite;
	}

}
