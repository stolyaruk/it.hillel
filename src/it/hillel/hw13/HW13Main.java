package it.hillel.hw13;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class HW13Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Matrix length (M): ");
        int n = sc.nextInt();

        System.out.println("Enter Matrix width (N): ");
        int m = sc.nextInt();

        int[][] arr = new int[n][];
        int[][] tArr = new int[m][];
        int counter = 1;

        for (int i = 0; i < tArr.length; i++) {
            tArr[i] = new int[n];
        }

        System.out.println("Original matrix: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[m];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = counter++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tArr[j][i] = arr[i][j];
            }
        }

        System.out.println("Transposed matrix: ");

        for (int i = 0; i < tArr.length; i++) {
            for (int j = 0; j < tArr[i].length; j++) {
                System.out.print(tArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
