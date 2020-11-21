package tdd.chapterTwo;

public abstract class TestCase {

    String name;

    public TestCase(String name) {
        this.name = name;
    }

    protected abstract void testMethod();
    protected abstract void testBrokenMethod() throws Exception;
    protected abstract void setUp();
    protected abstract void tearDown();

    public void run(TestResult result) {
        result.testStarted();
        this.setUp();
        try{
            if (this.name.equals("testMethod")) {
                testMethod();
            }
            else if (this.name.equals("testBrokenMethod")){
                testBrokenMethod();
            }
        } catch (Exception e){
            result.testFailed();
        }
        this.tearDown();
    }

}
