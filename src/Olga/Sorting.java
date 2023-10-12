package Olga;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {// 6 3 5 4 1 2   -> 1 2 3 4 5 6
        Scanner sc = new Scanner(System.in); // Создаём объект типа Scanner
        Random random = new Random(); // Создаём объект типа Random
        System.out.println("Длина массива:");
        int n = sc.nextInt();// Вводим длину массива с клавиатуры  ..   10
        System.out.println();
        Integer[] array = new Integer[n]; // создаём одномерный массив длиной = n
        // генерация
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(9); // заполняем массив случайными числами от 0 до 9
        }
        System.out.println("Массив без изменений");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " "); // выводим массив на экран
        }
        System.out.println();
        System.out.println();// 5 9 3 7 4 2 3
        // находим min max
        int min = array[0];// 2
        int max = array[0];// 9
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max=" + max + " min=" + min);
        System.out.println();

        // Сортировка пузырьком
        System.out.println("Сортировка пузырьком");// 7 9 5 4 3 3 2
        for (int i = array.length - 1; i > 0; i--) {//
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j+1]) {
                    int value = array[j];// 9
                    array[j] = array[j + 1];
                    array[j + 1] = value;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
        Arrays.sort(array);
        System.out.println("Отсортированный по возрастанию(Автоматическая)");

        // автоматическая автоматическая
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Отсортированный по убыванию(Автоматическая)");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
