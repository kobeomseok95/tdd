package tdd.chapterTwo;

public class TestResult {

    int runCount;
    int failureCount;

    public TestResult() {
        this.runCount = 0;
        this.failureCount = 0;
    }

    public void testStarted(){
        this.runCount += 1;
    }

    public void testFailed() {
        this.failureCount += 1;
    }

    public String summary(){
        return this.runCount + " run, " + this.failureCount +  " failed";
    }
}
