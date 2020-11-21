package tdd.chapterTwo;

import org.junit.Test;

public class WasRun extends TestCase {

    boolean wasRun;
    boolean wasSetUp;
    String log;

    public WasRun(String name) {
        super(name);
        this.wasRun = false;
    }

    public boolean wasRun() {
        return wasRun;
    }

    @Override
    protected void testMethod() {
        this.wasRun = true;
        this.log = this.log + " testMethod";
    }

    @Override
    protected void setUp(){
        this.wasRun = false;
        this.wasSetUp = true;
        this.log = "setUp";
    }

    @Override
    protected void tearDown() {
        this.log = this.log + " tearDown";
    }

    public void testBrokenMethod() throws Exception {
        throw new Exception();
    }
}
