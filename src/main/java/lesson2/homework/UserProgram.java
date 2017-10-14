package lesson2.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("пожалуйста, введите целое число");

        String parameter = reader.readLine();
        int number = Integer.parseInt(parameter);

        System.out.println("мне надо вывести в консоль " + Math.abs(number) + " строк");

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                System.out.println("Запись номер " + (i) + ". Осталось ещё " + (number - i) + " записей");
            }
        }

        if (number < 0) {
            for (int i = -1; i >= number; i--) {
                System.out.println("Запись номер " + (i*(-1)) + ". Осталось ещё " + ((-1)*number + i) + " записей");
            }
        }

        if (number == 0) {
            System.out.println("тут нечего выводить");
        }
    }
}