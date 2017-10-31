package enu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        String enteredDogName = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            enteredDogName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (Main.recognizeDog(enteredDogName)) {
            System.out.println("dog " + enteredDogName + " may come in");
        } else {
            System.out.println("dog " + enteredDogName + " can't come in");
        }
    }

    public static boolean recognizeDog(String enteredDogName) {
        enteredDogName = enteredDogName.toUpperCase();
        for (Dog dog : Dog.values()) {
            if (Objects.equals(enteredDogName, dog.toString())) {
                return true;
            }
        }
        return false;
    }
}
