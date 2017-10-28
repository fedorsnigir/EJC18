package homework2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrafficLightTest {

    TrafficLight trafficLight = new TrafficLight();
    String colour;

    @Test
    public void testKnowTheLight() {
        colour = trafficLight.knowTheLight(1);
        assertTrue(colour == "red light");
        colour = trafficLight.knowTheLight(3);
        assertEquals("yellow light", colour);
        colour = trafficLight.knowTheLight(6);
        assertEquals("green light", colour);
    }

    @Test(expected = RuntimeException.class)
    public void testException() {
        trafficLight.knowTheLight(-8);
    }
}
