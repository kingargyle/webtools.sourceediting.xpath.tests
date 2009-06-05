package org.eclipse.wst.xml.xpath2.processor.testsuite.core;

import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DateAddDTDTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DateAddYMDTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DateEQTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DateGTTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DateLTTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DateSubtractDTDTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DateSubtractYMDTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DateTimeAddDTDTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DateTimeEQTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DateTimeGTTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DateTimeLTTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DateTimeSubtractDTDTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DateTimeSubtractYMDTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DatesSubtractTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DayTimeDurationAddTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DayTimeDurationDivideDTDTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DayTimeDurationDivideTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DayTimeDurationGTTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DayTimeDurationLTTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DayTimeDurationMultiplyTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.DayTimeDurationSubtractTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.TimeAddDTDTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.TimeEQTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.TimeGTTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.TimeLTTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.TimeSubtractDTDTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.TimeSubtractTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.YearMonthDurationAddDTTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.YearMonthDurationAddTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.YearMonthDurationDivideTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.YearMonthDurationDivideYMDTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.YearMonthDurationGTTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.YearMonthDurationLTTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.YearMonthDurationMultiplyTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.YearMonthDurationSubtractTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.dateTimesSubtractTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.gDayEQTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.gMonthDayEQTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.gMonthEQTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.gYearEQTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.dates.gYearMonthEQTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.ABSFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.BaseURIFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.CeilingFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.DataFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.DateTimeFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.DocumentURIFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.ErrorFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.FloorFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.NilledFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.RoundEvenFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.RoundFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.StaticBaseURIFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.StringFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.functions.TraceFuncTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.numeric.NumericAddTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.numeric.NumericDivideTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.numeric.NumericEqualTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.numeric.NumericGTTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.numeric.NumericIntegerDivideTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.numeric.NumericLTTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.numeric.NumericModTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.numeric.NumericMultiplyTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.numeric.NumericSubtractTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.numeric.NumericUnaryMinusTest;
import org.eclipse.wst.xml.xpath2.processor.testsuite.numeric.NumericUnaryPlusTest;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllW3CCoreTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for W3C XPath 2.0 test suite.");
		//$JUnit-BEGIN$
		suite.addTestSuite(QNameEQTest.class);
		suite.addTestSuite(SeqUnionTest.class);
		suite.addTestSuite(LogicExprTest.class);
		suite.addTestSuite(ForExprWithoutTest.class);
		suite.addTestSuite(NodeBeforeTest.class);
		suite.addTestSuite(CondExprTest.class);
		suite.addTestSuite(FilterExprTest.class);
		suite.addTestSuite(BooleanEqualTest.class);
		suite.addTestSuite(ParenExprTest.class);
		suite.addTestSuite(LiteralsTest.class);
		suite.addTestSuite(GenCompNETest.class);
		suite.addTestSuite(SeqExceptTest.class);
		suite.addTestSuite(QuantExprWithTest.class);
		suite.addTestSuite(AxesTest.class);
		suite.addTestSuite(Base64BinaryEQTest.class);
		suite.addTestSuite(XQueryCommentTest.class);
		suite.addTestSuite(PrefixFromQNameTest.class);
		suite.addTestSuite(QuantExprTest.class);
		suite.addTestSuite(commaOpTest.class);
		suite.addTestSuite(GenCompGTEQTest.class);
		suite.addTestSuite(ExternalContextExprTest.class);
		suite.addTestSuite(RangeExprTest.class);
		suite.addTestSuite(InternalContextExprTest.class);
		suite.addTestSuite(AbbrAxesTest.class);
		suite.addTestSuite(NodeAfterTest.class);
		suite.addTestSuite(SeqExprInstanceOfTest.class);
		suite.addTestSuite(NodeSameTest.class);
		suite.addTestSuite(BooleanLTTest.class);
		suite.addTestSuite(BooleanGTTest.class);
		suite.addTestSuite(SeqExprCastableTest.class);
		suite.addTestSuite(ReturnExprTest.class);
		suite.addTestSuite(NodeTestTest.class);
		suite.addTestSuite(GenCompLTTest.class);
		suite.addTestSuite(DurationEQTest.class);
		suite.addTestSuite(CombNodeSeqTest.class);
		suite.addTestSuite(SeqIntersectTest.class);
		suite.addTestSuite(NameTestTest.class);
		suite.addTestSuite(NodeNameFuncTest.class);
		suite.addTestSuite(SequenceTypeSyntaxTest.class);
		suite.addTestSuite(GenCompEqTest.class);
		suite.addTestSuite(PredicatesTest.class);
		suite.addTestSuite(SeqExprCastTest.class);
		suite.addTestSuite(GenCompGTTest.class);
		suite.addTestSuite(HexBinaryEQTest.class);
		suite.addTestSuite(UnabbrAxesTest.class);
		suite.addTestSuite(ForExprWithTest.class);
		suite.addTestSuite(GenCompLTEQTest.class);
		//$JUnit-END$
		return suite;
	}

}
