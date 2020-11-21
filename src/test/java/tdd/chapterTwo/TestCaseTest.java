package tdd.chapterTwo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCaseTest {

    WasRun test;

    @Before
    public void setUp(){
        test = new WasRun("testMethod");
    }

//    @Test
//    public void TestCaseTest(){
//        assertEquals(false, test.wasRun());
//        test.run();
//        assertEquals(true, test.wasRun());
//    }

    @Test
    public void testTemplateMethod(){
        test = new WasRun("testMethod");
        TestResult result = new TestResult();
        test.run(result);
        assertEquals("setUp testMethod tearDown", this.test.log);
    }

    @Test
    public void testResult(){
        test = new WasRun("testMethod");
        TestResult result = new TestResult();
        test.run(result);
        assertEquals("1 run, 0 failed", result.summary());
    }

    @Test
    public void testFailedResult(){
        test = new WasRun("testBrokenMethod");
        TestResult result = new TestResult();
        test.run(result);
        assertEquals("1 run, 1 failed", result.summary());
    }

    @Test
    public void testFailedResultFormatting(){
        TestResult result = new TestResult();
        result.testStarted();
        result.testFailed();
        assertEquals("1 run, 1 failed", result.summary());
    }

    @Test
    public void testSuite(){
        TestSuite suite = new TestSuite();
        suite.addTestCase(new WasRun("testMethod"));
        suite.addTestCase(new WasRun("testBrokenMethod"));
        TestResult result = new TestResult();
        suite.run(result);
        assertEquals("2 run, 1 failed", result.summary());
    }
}
