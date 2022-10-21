package it.hillel.hw9;

import java.util.Random;
import java.util.Scanner;

public class HW9Main {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = randomNumber.nextInt(10);
        System.out.println("Guess a number: ");
        int userNumber = scanner.nextInt();
        int counter = 3;

        while (counter >= 3) {
            if (userNumber != secretNumber) {
                System.out.println("You lost! Try again.  The secret number was " + secretNumber);
            } else {
                System.out.println("You win! The secret number was " + secretNumber);
            }
            counter--;
        }
    }
}
