import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class MonthValidator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false; // Declared once outside the loop

        do {
            System.out.println("What is your birth month? (1-12)");

            if (in.hasNextInt()) {
                int birthMonth = in.nextInt();
                in.nextLine(); // Clear buffer

                if (birthMonth >= 1 && birthMonth <= 12) {
                    System.out.println("Your birth month is: " + birthMonth);
                    done = true; // Valid input -> end loop
                } else {
                    System.out.println("You entered an incorrect month value: " + birthMonth);
                }
            } else {
                String trash = in.nextLine(); // Read bad input
                System.out.println("You entered an incorrect month value: " + trash);
            }
        } while (!done);

        in.close();
    }
}