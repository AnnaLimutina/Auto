package Olga;

import java.util.Arrays;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        task5();

    }

    private static void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        int[][] arr = new int[a][a];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                arr[i][j] = (int) (Math.random() * 10);
            }
        }


        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] / 10 == 0){
                    System.out.print(" " + arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[j][i] + "  ");
            }
            System.out.println();
        }


    }

    private static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        int[][] arr = new int[a][a];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                arr[i][j] = (int) (Math.random() * 10);
            }
        }


        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] / 10 == 0){
                    System.out.print(" " + arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length ; j++){
                if (j < arr[i].length - 1 - i) {

                    sum += arr[i][j];
                }
            }
        }
        System.out.println("sum is " + sum);



    }

    private static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        int[][] arr = new int[a][a];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                arr[i][j] = (int) (Math.random() * 50);
            }
        }


        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] / 10 == 0){
                    System.out.print(" " + arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }



        int mainDiagonalProduct = 1;
        int secondaryDiagonalProduct = 1;

        for (int i = 0; i < arr.length; i++){
            mainDiagonalProduct *= arr[i][i];
            secondaryDiagonalProduct *= arr[i][arr.length - 1 - i];
        }
        if (mainDiagonalProduct > secondaryDiagonalProduct){
            System.out.println(String.format("Product of main diagonal %d is more than secondary %d", mainDiagonalProduct, secondaryDiagonalProduct));
        } else if (mainDiagonalProduct == secondaryDiagonalProduct) {
            System.out.println(String.format("they are equals %d and %d", mainDiagonalProduct, secondaryDiagonalProduct));
        } else {
            System.out.println(String.format("Product of secondary diagonal %d is more than main %d", secondaryDiagonalProduct, mainDiagonalProduct));
        }
    }

    private static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        int[][] arr = new int[a][a];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                arr[i][j] = (int) (Math.random() * 50);
            }
        }


        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] / 10 == 0){
                    System.out.print(" " + arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (j <= i){
                    if (arr[i][j] % 2 != 0){
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }

    }

    public  static void createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        int[][] arr = new int[a][a];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                arr[i][j] = (int) (Math.random() * 50);
            }
        }


        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] / 10 == 0){
                    System.out.print(" " + arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    private static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        int[][] arr = new int[a][a];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                arr[i][j] = (int) (Math.random() * 50);
            }
        }


        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] / 10 == 0){
                    System.out.print(arr[i][j] + "  ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i][i] % 2 == 0 && arr[i][i] != 0){
                sum += arr[i][i];
            }
        }
        System.out.println("\nSum is " + sum);



    }






}
