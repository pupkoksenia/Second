package com.bsu.by;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Write size of matrix");
            int size = input.nextInt();

            int[][] firstArray = new int[size][size];
            int[][] secondArray = new int[size][size];

            System.out.println("Write integers in first  matrix");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    Scanner in = new Scanner(System.in);
                    firstArray[i][j] = in.nextInt();
                }
            }


            System.out.println("Write integers in second matrix");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    Scanner in = new Scanner(System.in);
                    secondArray[i][j] = in.nextInt();
                }
            }

            int[][] newArray = new int[size][size];

            int[] tmpArray = new int[size];
            for (int i = 0; i < size; i++) {
                int x = secondArray[i][0];
                for (int j = 1; j < size; j++) {
                    x = x * secondArray[i][j];
                }
                tmpArray[i] = x;
            }

            for (int j = 0; j < size; j++) {
                for (int i = 0; i < size; i++) {
                    newArray[i][j] = firstArray[i][j] + tmpArray[j];
                }
            }

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(newArray[i][j] + " ");
                }
                System.out.println();
            }
            if (size <= 0) {
                throw new Exception("Число k должно быть натуральным");
            }

            input.close();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

    }
}

