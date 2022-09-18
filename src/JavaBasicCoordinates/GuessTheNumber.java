package JavaBasicCoordinates;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = randomNumber.nextInt(6);

        System.out.println("Guess a number: ");

        int userNumber = scanner.nextInt();

        if (userNumber == secretNumber) {
            System.out.println("You win! The secret number was " + secretNumber);
        } else {
            System.out.println("You loose. The secret number was " + secretNumber);
        }

    }
}
