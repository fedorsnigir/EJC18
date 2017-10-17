package lesson5.homework;

import org.junit.Assert;
import org.junit.Test;

public class TestTrafficLight {
    TrafficLight trafficLight = new TrafficLight();
    String colour;

    @Test
    public void testRedLight() {
        colour = trafficLight.knowTheLight(0);
        Assert.assertTrue(colour == "red light");
        colour = trafficLight.knowTheLight(1);
        Assert.assertTrue(colour == "red light");
    }

    @Test
    public void testYellowLight() {
        colour = trafficLight.knowTheLight(2);
        Assert.assertEquals(colour, "yellow light");
        colour = trafficLight.knowTheLight(4);
        Assert.assertEquals(colour, "yellow light");
    }

    @Test
    public void testGreenLight() {
        colour = trafficLight.knowTheLight(5);
        Assert.assertEquals(colour, "green light");
        colour = trafficLight.knowTheLight(9);
        Assert.assertEquals(colour, "green light");
    }
}
