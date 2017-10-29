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

        switch (enteredMonth) {
            case "1":
                System.out.println("january");
                break;
            case "2":
                System.out.println("february");
                break;
            case "3":
                System.out.println("march");
                break;
            case "4":
                System.out.println("april");
                break;
            case "5":
                System.out.println("may");
                break;
            case "6":
                System.out.println("june");
                break;
            case "7":
                System.out.println("july");
                break;
            case "8":
                System.out.println("august");
                break;
            case "9":
                System.out.println("september");
                break;
            case "10":
                System.out.println("october");
                break;
            case "11":
                System.out.println("november");
                break;
            case "12":
                System.out.println("december");
                break;
            default:
                throw new RuntimeException("no such month");
        }
    }
}
