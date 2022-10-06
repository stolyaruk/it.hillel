package it.hillel.hw11;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class HW11Main {
    public static void main(String[] args) {
        int [] team1 = new int[25];
        int [] team2 = new int[25];

        Random random = new Random();

        System.out.print("Team1 players' age: ");

        for (int i = 0; i < team1.length; i++) {
            int randomNumber = random.nextInt(18,40);
            team1[i] = randomNumber;
        }
        for (int i: team1) {
           System.out.print(i + ", ");
       }
        int ageAverage1 = ((IntStream.of(team1).sum()) / team1.length);
        System.out.println();
        System.out.println("Team1 age average: " + ageAverage1);
        System.out.println();
        System.out.print("Team2 players' age: ");

        for (int i = 0; i < team2.length; i++) {
            int randomNumber = random.nextInt(18,40);
            team2[i] = randomNumber;
        }
        for (int i: team2) {
            System.out.print(i + ", ");
        }
        int ageAverage2 = ((IntStream.of(team2).sum()) / team2.length);
        System.out.println();
        System.out.println("Team1 age average: " + ageAverage2);
    }
}
