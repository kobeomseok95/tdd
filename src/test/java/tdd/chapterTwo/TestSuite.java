package tdd.chapterTwo;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    List<TestCase> tests;

    public TestSuite() {
        this.tests = new ArrayList<TestCase>();
    }

    public void addTestCase(TestCase test){
        this.tests.add(test);
    }

    public void run(TestResult result){
        for (TestCase test : tests) {
            test.run(result);
        }
    }
}
