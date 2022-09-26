package it.hillel.hw9;

import java.util.Random;
import java.util.Scanner;

public class HW9Main {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = randomNumber.nextInt(10);

        for (int i = 0; i < 3; i++) {
            System.out.println("Guess a number: ");
            int userNumber = scanner.nextInt();

            if (userNumber == secretNumber) {
                System.out.println("You win! The secret number was " + secretNumber);
                break;

            } else {
                System.out.println("You lost! Try again.  The secret number was " + secretNumber);

            }
        }

    }
}
