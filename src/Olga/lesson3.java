package Olga;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        task9();
        //subtask6();
    }

    private static void subtask6() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("arr: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == arr[i + 1]) {
                System.out.println("Есть одинаковые элементы: " + i + " и " + (i + 1));
            } else {
                System.out.println("Элементы различны");
            }
        }

    }

    private static void subtask4() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        System.out.println("arr: " + Arrays.toString(arr));

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (arr[i] < min){
                    min = arr[i];
                }
            }
        }
        System.out.println("The smallest element is " + min);




    }

    private static void subtask3() {

        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 20);
        }
        System.out.println("arr: " + Arrays.toString(arr));

        System.out.println("Enter a number: ");
        int c = sc.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > c) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println(sum + " / " + count + " = " + sum/count);





    }

    private static void subtask2() {
        int[] arr1 = new int[10];

        for (int i = 0; i <= 9; i++){
            arr1[i] = (int)(Math.random() * 9);
        }
        System.out.println(Arrays.toString(arr1));

        int el = 0;
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                el += arr1[i];
                count++;
            }
        }
        System.out.println(el + " / " + count + " = " + el/count );

    }







    private static void subtask1() {
        int[] arr1 = new int[10];

        for (int i = 0; i <= 9; i++){
            arr1[i] = (int)(Math.random() * 9);
        }
        System.out.println(Arrays.toString(arr1));

        int el = 1;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 3 == 0) {
                el *= arr1[i];
            }
        }
        System.out.println(el);

    }

    private static void task10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number more than 3: ");
        int n = sc.nextInt();
        if (n > 3) {

            int[] arr1 = new int[n];
            int count = 0;

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = (int) (Math.random() * n);
                if (arr1[i] % 2 == 0 && arr1[i] != 0) count++;
            }
            System.out.println("arr1: " + Arrays.toString(arr1));

            int[] arr2 = new int[count];

                for (int j = 0, i = 0; j < arr1.length; j++) {           //0
                    if (arr1[j] % 2 == 0 && arr1[j] != 0) {
                        arr2[i] = arr1[j];
                        i++;                                  //2
                    }
                }

            System.out.println("arr2: " + Arrays.toString(arr2));

        } else {
            System.out.println("You've entered a wrong number!! Please, enter a number less than 3!!");
        }

    }

    private static void task9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(arr));

        int sumLeft = 0;
        int sumRight = 0;


            for (int i = 0; i < arr.length / 2; i++){
                sumLeft += arr[i];
                sumRight += arr[a - 1 - i];
            }


            if (sumLeft > sumRight) {
                System.out.println(String.format("The left part %d is more than right %d", sumLeft, sumRight));
            } else if (sumLeft == sumRight) {
                System.out.println("The blocks are equal");
            } else {
                System.out.println(String.format("The left part %d is less than right %d", sumLeft, sumRight));
            }



//        for (int i: arr){
//            total += i;
//        }
//
//        if (sumLeft > total - sumLeft) {
//            System.out.println(String.format("The left part %d is more than right %d", sumLeft, total - sumLeft));
//        } else if (sumLeft == total - sumLeft) {
//            System.out.println("The blocks are equal");
//        } else {
//            System.out.println(String.format("The left part %d is less than right %d", sumLeft, total - sumLeft));
//        }


    }

    private static void task8() {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];

        for (int i = 0; i <= 9; i++){
            arr1[i] = (int)(Math.random() * 9);
            arr2[i] = (int)(Math.random() * 9);
        }
        System.out.println("The 1st array: " + Arrays.toString(arr1));
        System.out.println("The 2nd array: " + Arrays.toString(arr2));

        for (int i = 0; i < arr3.length; i++){
            arr3[i] = arr1[i]/(arr2[i] * 1.0);
        }
        System.out.println("The 3d array: " + Arrays.toString(arr3));


    }

    private static void task7() {
        int[] array = new int[12];

        for (int i = 0; i <= 11; i++){
            array[i] = (int)(Math.random() * 15);
        }
        System.out.println(Arrays.toString(array) + "\n");

        int max = array[0];
        for (int i = 0; i <=11; i++){
            max = Math.max(max, array[i]);
        }
        System.out.print("Max value from array is " + max + ", it's an element # ");
        for (int i = 0; i < array.length; i++){
            if (array[i] == max){
                System.out.println(i);
            }
        }


    }

    private static void task6() {
        int[] array = new int[4];

        for (int i = 0; i <= 3; i++){
            array[i] = (int)(Math.random() * 10);
        }

        for (int i: array){
            System.out.print(i + " ");
        }
        int count = 0;
        for (int i = 1; i <=3; i++){
            if (array[i] >= array[i - 1]){
                count++;
            }
        }
        if (count == 3) {
            System.out.println("The array is in strictly increasing sequence");
        }


    }

    private static void task5() {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        for (int i = 0; i <= 4; i++){
            arr1[i] = (int)(Math.random() * 15);
            arr2[i] = (int)(Math.random() * 15);
        }

        for (int i: arr1){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i: arr2){
            System.out.print(i + " ");
        }
        System.out.println();

        int sumArr1 = 0;
        int sumArr2 = 0;

        for (int i = 0; i <=4; i++){
            sumArr1 += arr1[i];
            sumArr2 += arr2[i];
        }
        if ( sumArr1/arr1.length == sumArr2/arr2.length) {
            System.out.println(String.format("The first array's average sum %d is equal the second's %d",
                    sumArr1/arr1.length, sumArr2/arr2.length));
        } else if (sumArr1/arr1.length > sumArr2/arr2.length) {
            System.out.println(String.format("The first array's average sum %d is more the second's %d",
                    sumArr1/arr1.length, sumArr2/arr2.length));
        } else {
            System.out.println(String.format("The first array's average sum %d is less the second's %d",
                    sumArr1/arr1.length, sumArr2/arr2.length));
        }


    }

    private static void task4() {

        int[] array = new int[20];

        for (int i = 0; i <= 19; i++){
            array[i] = (int)(Math.random() * 20);
        }

        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 19; i++){
            if (i % 2 != 0){
                array[i] = 0;
            }
        }

        for (int i : array){
            System.out.print(i + " ");
        }






    }

    private static void task3() {

        int[] array = new int[15];

        for (int i = 0; i <= 14; i++){
            array[i] = (int)(Math.random() * 100);
        }

        for (int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i <= 14; i++){
            if (array[i] % 2 == 0){
            count++;
            }
        }
        System.out.println("Count of even elements is " + count);





    }

    private static void task2() {
        int[] array = new int[50];
        int a = 0;

        for (int i = 1; i <= 99; i += 2){
            array[a] = i;
            a++;
        }

        for (int i: array){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 49; i >= 0; i--){
            System.out.print(array[i] + " ");
        }

    }

    private static void task1() {
        int[] array = new int[10];
        int a = 0;
        for (int j = 2; j <=20; j += 2){
                array[a] = j;
                a++;
            }
        for (int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i: array){
            System.out.print(i + "\n");
        }
    }


    }


