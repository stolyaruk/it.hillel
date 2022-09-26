package it.hillel;

import java.util.Scanner;
import java.util.function.DoublePredicate;

public class Calculator {

    public static void main(String[] args) {

        float number1, number2, result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть букву для виконання дії:");
        System.out.println("a - додавання");
        System.out.println("b - віднімання");
        System.out.println("c - множення");
        System.out.println("d - ділення");

        char operation = sc.nextLine().charAt(0);

        System.out.println("Введіть перше число: ");
        number1 = sc.nextFloat();
        System.out.println("Введіть друге число:");
        number2 = sc.nextFloat();

        switch (operation) {

            case 'a' -> {
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
            }

            case 'b' -> {
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
            }

            case 'c' -> {
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
            }

            case 'd' -> {
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            }
            default -> System.out.println("Зробіть правильний вибір!");
        }

    }
}
