package taskException2;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testKnowMonth() {
        Assert.assertEquals("january", Main.knowMonth("1"));
        Assert.assertEquals("march", Main.knowMonth("3"));
        Assert.assertEquals("december", Main.knowMonth("12"));
    }

    @Test(expected = RuntimeException.class)
    public void testException() {
        Main.knowMonth("-10");
    }
}