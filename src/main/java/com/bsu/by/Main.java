package com.bsu.by;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
          //  Scanner input = new Scanner(System.in);
            System.out.println("Write size of matrix");
            int size = input.nextInt();

            if (size <= 0) {
                throw new Exception("Число k должно быть натуральным");
            }
            int[][] firstArray = new int[size][size];
            int[][] secondArray = new int[size][size];

            System.out.println("Write integers in first  matrix and second");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    firstArray[i][j] = input.nextInt();
                    secondArray[i][j] = input.nextInt();
                }
            }


            int[][] newArray = createMatrix(firstArray,secondArray,size);

          /*  int[] tmpArray = new int[size];
            for (int i = 0; i < size; i++) {
                int x = secondArray[i][0];
                for (int j = 1; j < size; j++){
                    x = x * secondArray[i][j];
                }
                tmpArray[i] = x;
            }

            for (int j = 0; j < size; j++) {
                for (int i = 0; i < size; i++) {
                    newArray[i][j] = firstArray[i][j] + tmpArray[j];
                }
            }
*/
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(newArray[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("First");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(firstArray[i][j] + " ");
                }
                System.out.println();
            }
System.out.println("second");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(secondArray[i][j] + " ");
                }
                System.out.println();
            }
            //input.close();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        finally {
            System.err.println("All done");
        }

    }
    static int[][] createMatrix(int[][] firstArray, int[][] secondArray,int size){
        int[][] newArray = new int[size][size];

        int[] tmpArray = new int[size];
        for (int i = 0; i < size; i++) {
            int x = secondArray[i][0];
            for (int j = 1; j < size; j++){
                x = x * secondArray[i][j];
            }
            tmpArray[i] = x;
        }

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                newArray[i][j] = firstArray[i][j] + tmpArray[j];
            }
        }
        return newArray;
    }
}

