package lesson5.homework;

/**
 * the class is needed for working with traffic lights
 */
public class TrafficLight {

    public String colour;

    /**
     * the method is needed for returning the traffic light depending on entered minutes
     */
    public String knowTheLight(int minuteNumber) {

        int minuteInOneCycle = (minuteNumber % 60) % 10;

        if (minuteInOneCycle < 0) {
            return colour = "you entered negative number, please enter positive";
        } else if (minuteInOneCycle < 2) {
            return colour = "red light";
        } else if (minuteInOneCycle < 5) {
            return colour = "yellow light";
        } else {
            return colour = "green light";
        }
    }
}