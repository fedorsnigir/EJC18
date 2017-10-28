package homework2;

import org.junit.Assert;
import org.junit.Test;

public class TestTrafficLight {
    TrafficLight trafficLight = new TrafficLight();
    String colour;

    @Test
    public void testKnowTheLight() {
        colour = trafficLight.knowTheLight(1);
        Assert.assertTrue(colour == "red light");
        colour = trafficLight.knowTheLight(3);
        Assert.assertEquals(colour, "yellow light");
        colour = trafficLight.knowTheLight(6);
        Assert.assertEquals(colour, "green light");
    }

    @Test(expected = RuntimeException.class)
    public void testException() {
        trafficLight.knowTheLight(-8);
    }
}
