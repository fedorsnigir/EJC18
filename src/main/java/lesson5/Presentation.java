package lesson5;

import java.io.IOException;

/**
 * the class is needed for presenting task results
 */
public class Presentation {
    /**
     * the main method is needed for program launch
     */
    public static void main(String[] args) throws IOException {

        TrafficLight trafficLight = new TrafficLight();

        trafficLight.knowTheLight();

        System.out.println(trafficLight.colour);
    }
}