package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * the class is needed for working with traffic lights
 */
public class TrafficLight {

    public String colour;

    /**
     * the method is needed for returning the traffic light depending on entered minutes
     */
    public String knowTheLight() throws IOException {

        System.out.println("good evening! this is Know the traffic light program");
        System.out.println("please, enter minutes number");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String enteredInfo = reader.readLine();

        int minuteNumber = 0;
        try {
            minuteNumber = Integer.parseInt(enteredInfo);
        } catch (NumberFormatException e) {
            System.out.println("please enter integer number");
        }

        int minuteInOneCycle = (minuteNumber % 60) % 10;

        if (minuteInOneCycle < 0) {
            return colour = "you entered negative number, there is no light";
        } else if (minuteInOneCycle < 2) {
            return colour = "red light";
        } else if (minuteInOneCycle < 5) {
            return colour = "yellow light";
        } else {
            return colour = "green light";
        }
    }
}