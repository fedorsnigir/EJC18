package taskException1;

import org.junit.Assert;
import org.junit.Test;

public class BarsikTest {

    @Test
    public void testIsBarsik() {
        Barsik barsik = new Barsik("Barsik");
        Assert.assertEquals(barsik.isBarsik(), true);
        Barsik bars = new Barsik("Bars");
        Assert.assertEquals(bars.isBarsik(), false);
        Barsik emptyCat = new Barsik("");
        Assert.assertEquals(emptyCat.isBarsik(), false);
    }
}