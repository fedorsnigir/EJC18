package homework2;

/**
 * the class is needed for working with traffic lights
 */
public class TrafficLight {

    String colour;

    /**
     * the method is needed for returning the traffic light depending on entered minutes
     */
    public String knowTheLight(int minuteNumber) {

        if (minuteNumber < 0) {
            throw new RuntimeException ("please enter positive number");
        } else {
            int minuteInOneCycle = (minuteNumber % 60) % 10;

            if (minuteInOneCycle < 2) {
                return colour = "red light";
            } else if (minuteInOneCycle < 5) {
                return colour = "yellow light";
            } else if (minuteInOneCycle < 10){
                return colour = "green light";
            }
            throw new RuntimeException ("error with colour");
        }
    }
}