package it.hillel.hw12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class HW12Main {
    public static void main(String[] args) {
        int [] generatedNumbers = new int[10];
        int [] customerNumbers = new int[10];
        int  counter = 0;
        int [] arrLength = new int[10];

        Random random = new Random();

        System.out.print("[");

        for (int i = 0; i < generatedNumbers.length; i++) {
            int randomNumber = random.nextInt(9);
            generatedNumbers[i] = randomNumber;
        }
        Arrays.sort(generatedNumbers);

        for (int i: generatedNumbers) {
            System.out.print(generatedNumbers[i] + ",");
        }

        System.out.print("]");
        System.out.println();
        System.out.print("[");

        for (int i = 0; i < customerNumbers.length; i++) {
            int randomNumber = random.nextInt(9);
            customerNumbers[i] = randomNumber;
        }
        Arrays.sort(customerNumbers);

        for (int i: customerNumbers) {
            System.out.print(i + ",");
            Arrays.sort(customerNumbers);
        }

        for (int i: customerNumbers) {
            if (customerNumbers[i] == generatedNumbers[i]) {
                counter++;
            }
        }
        System.out.println("]");
        System.out.println("Count of: " + counter);
     }
}
