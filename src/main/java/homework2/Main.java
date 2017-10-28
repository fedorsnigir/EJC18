package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * the class is needed for presenting task results
 */
public class Main {

    static int minuteNumber;

    /**
     * the main method is needed for program launch
     */
    public static void main(String[] args) throws IOException {

        System.out.println("please, enter minutes number");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String enteredInfo = reader.readLine();

        try {
            minuteNumber = Integer.parseInt(enteredInfo);
            TrafficLight trafficLight = new TrafficLight();
            trafficLight.knowTheLight(minuteNumber);
            System.out.println(trafficLight.colour);
        } catch (NumberFormatException e) {
            System.err.println("please, enter integer number");
        }
    }
}