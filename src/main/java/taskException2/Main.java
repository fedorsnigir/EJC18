package taskException2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String enteredMonth = null;

        System.out.println("enter month");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)))) {
            enteredMonth = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(knowMonth(enteredMonth));
    }

    public static String knowMonth(String enteredMonth) {
        switch (enteredMonth) {
            case "1":
                return "january";
            case "2":
                return "february";
            case "3":
                return "march";
            case "4":
                return "april";
            case "5":
                return "may";
            case "6":
                return "june";
            case "7":
                return "july";
            case "8":
                return "august";
            case "9":
                return "september";
            case "10":
                return "october";
            case "11":
                return "november";
            case "12":
                return "december";
            default:
                throw new RuntimeException("no such month");
        }
    }
}
