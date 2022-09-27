package it.hillel.hw10;

import java.awt.*;
import java.util.Random;

public class HW10Main {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(1000);
            System.out.println(randomNumber);
        }
    }
}

