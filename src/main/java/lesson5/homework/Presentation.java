package lesson5.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * the class is needed for presenting task results
 */
public class Presentation {

    private static int minuteNumber;

    /**
     * the main method is needed for program launch
     */
    public static void main(String[] args) throws IOException {

        System.out.println("please, enter number of minutes");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String enteredInfo = reader.readLine();

        try {
            minuteNumber = Integer.parseInt(enteredInfo);
        } catch (NumberFormatException e) {
            System.out.println("please enter integer number");
        }

        TrafficLight trafficLight = new TrafficLight();

        trafficLight.knowTheLight(minuteNumber);

        System.out.println(trafficLight.colour);
    }
}