package taskException1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String enteredName = null;

        System.out.println("enter cat name");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)))) {
            enteredName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Barsik barsik = new Barsik(enteredName);

        if (barsik.isBarsik()) {
            System.out.println("barsik is found");
        } else {
            throw new BarsikPointerException("alarm! barsik is not found. there is - " + enteredName);
        }
    }
}
