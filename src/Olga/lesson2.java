package Olga;

import java.math.BigInteger;
import java.util.Scanner;

public class lesson2 {

    public static void taskNumber(int number, String block) {
        System.out.println("______________________________\n" + block + ": Task number # " + number + "\n");
    }


    public static void main(String[] args) {

//        //Ветвления
//        //1
//        taskNumber(1, "Branching");
//
//        int corner1 = (int)(Math.random() * 180);
//        int corner2 = (int)(Math.random() * 180);
//
//        if ((corner1 > 90 || corner2 > 90) || (corner1 == 90 && corner2 == 90)) {
//            System.out.println("Corner1 = " + corner1 + ", and corner2 = " + corner2 + ", so the triangle doesn't exist");
//        } else {
//            System.out.println("Corner1 = " + corner1 + ", and corner2 = " + corner2 + ", so the triangle exists");
//        }
//        //2
//        taskNumber(2, "Branching");
//        System.out.print("The 1st approach: ");
//
//        int a = (int)(Math.random() * 1000);
//        int b = (int)(Math.random() * 1000);
//        int c = (int)(Math.random() * 1000);
//        int d = (int)(Math.random() * 1000);
//        int min1 = a;
//        int min2 = c;
//
//        // The 1st approach
//
//        if (Math.min(a, b) >= Math.min(c, d)) {
//            System.out.println("Max value from "+ Math.min(a, b) + " and " + Math.min(c, d) + " is " + Math.min(a, b));
//        } else {
//            System.out.println("Max value from "+ Math.min(a, b) + " and " + Math.min(c, d) + " is " + Math.min(c, d));
//        }
//
//        // The 2nd approach
//        System.out.println("The 2nd approach: \n");
//
//        if (a <= b) {
//            System.out.println("The smallest value from " + a + " and " + b + " is " + a);
//        } else {
//            System.out.println("The smallest value from " + a + " and " + b + " is " + b);
//            min1 = b;
//        }
//        if (c <= d) {
//            System.out.println("The smallest value from " + c + " and " + d + " is " + c);
//        } else {
//            System.out.println("The smallest value from " + c + " and " + d + " is " + d);
//            min2 = d;
//        }
//        if (min1 >= min2) {
//            if (a <= b) {
//                System.out.print("The biggest value from " + a + " and ");
//            } else {
//                System.out.print("The biggest value from " + b + " and ");
//            }
//            if (c <= d) {
//                System.out.print(c);
//            } else {
//                System.out.print(d);
//            }
//            System.out.println(" is " + min1);
//
//        }  else {
//            if (a <= b) {
//                System.out.print("The biggest value from " + a + " and ");
//            } else {
//                System.out.print("The biggest value from " + b + " and ");
//            }
//            if (c <= d) {
//                System.out.print(c);
//            } else {
//                System.out.print(d);
//            }
//            System.out.println(" is " + min2);
//        }
//        //3
//        taskNumber(3, "Branching");
//        double x_1 = Math.random() * 10;
//        double x_2 = Math.random() * 10;
//        double x_3 = Math.random() * 10;
//        double y_1 = Math.random() * 10;
//        double y_2 = Math.random() * 10;
//        double y_3 = Math.random() * 10;
//
//
//        if ((x_3 - x_1) / (x_2 - x_1) == (y_3 - y_1) / (y_2 - y_1)) {
//            System.out.println("The dots are on the same line");
//        } else {
//            System.out.println("The dots are not on the same line");
//        }
//        //4
//        taskNumber(4, "Branching");
//        int holeSideA = (int)(Math.random() * 100);
//        int holeSideB = (int)(Math.random() * 100);
//        int brickSideX = (int)(Math.random() * 100);
//        int brickSideY = (int)(Math.random() * 100);
//        int brickSideZ = (int)(Math.random() * 100);
//        System.out.println("The hole has size: " + holeSideA + " and " + holeSideB);
//        System.out.println("The brick has size: " + brickSideX + ", " + brickSideY + " and " + brickSideZ);
//
//        if ((holeSideA > brickSideX && holeSideB > brickSideY) || (holeSideA > brickSideY && holeSideB > brickSideX) ||
//                (holeSideA > brickSideX && holeSideB > brickSideZ) || (holeSideA > brickSideY && holeSideB > brickSideZ)
//        || (holeSideA > brickSideZ && holeSideB > brickSideY) || (holeSideA > brickSideZ || holeSideB > brickSideX)) {
//            System.out.println("The brick can pass");
//        } else {
//            System.out.println("The brick can not pass");
//        }
//
//        //5
//        taskNumber(5, "Branching");
//
//        int x = (int)(Math.random() * 6);
//
//        if (x <= 3) {
//            System.out.println("x = " + x + " and x * x - 3 * x + 9 = " + (x * x - 3 * x + 9));
//        } else {
//            System.out.println("x = " + x + " and 1 / (x * x * x + 6) = " + 1.0 / (x * x * x + 6));
//        }
//        // Cycles
//        taskNumber(1, "Cycles");
//
//        System.out.print("Enter a number: ");
        Scanner num = new Scanner(System.in);
//        int number = num.nextInt();
//        int sum = 0;
//
//        for (int i = 0; i <= number; i++) {
//            sum += i;
//        }
//        System.out.println("The sum of numbers from 0 and by " + number + " is " + sum);
//
//        //2
//        taskNumber(2, "Cycles");
//
//        a = 0;
//        b = 10;
//        int h = 2;
//
//        for (int i = a; i < b; i += h) {
//            if (i > 2) {
//                System.out.print(i + " ");
//            } else {
//                System.out.print(i * -1 + " ");
//            }
//        }
//
//        //3
//        taskNumber(3, "Cycles");
//        sum = 0;
//
//        for (int i = 0; i <= 100; i++) {
//            sum += i * i;
//        }
//        System.out.println("Sum is " + sum);

        //4
        taskNumber(4, "Cycles");
        BigInteger s = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++){
            s = s.multiply(BigInteger.valueOf((long)i + i));
        }
        System.out.println(s);



        //5
        taskNumber(5, "Cycles");
        int from = 0;
        int by = 10;
        double a = 1;
        double sum = 0;
        for (int i = 0; i <=10; i++) {
            double b = (1/Math.pow(2, i) + 1 / Math.pow(3, i));
            if (Math.abs(b) >= a ) {
                sum += i;
            }
        }
        System.out.println(sum);



        //6
        taskNumber(6, "Cycles");
        String st = "";
        for (int i = 0; i <=9; i++){

            System.out.println((char)i);
        }
        //7
        int n ;
        int m = 20;

        for (int i = 1; i <= 20; i++){
            System.out.println("Делитель для " + i + ":\n");
            for (int j = 1; j <= 20; j++){
                if (j != 1 && j != i){
                    if (i % j == 0){
                        System.out.print( j + ", ");
                    }
                }
                }
            System.out.println();
        }



        //8
        taskNumber(8, "Cycles");

        System.out.println("Enter a");
        int c = num.nextInt();
        System.out.println("Enter b");
       int  b = num.nextInt();

        int[] arr = new int[10];

        while (c != 0) {
            arr[c % 10]++;
            c/=10;
        }
        while (b != 0) {
            if (arr[b % 10] != 0){
                System.out.println(b % 10);
            }
            b /= 10;
        }
//
//        while (a != 0) {
//            arr[a % 10]++;
//            a /=10;
//        }
//        while (b != 0) {
//            if (arr[b % 10] != 0) {
//                System.out.println(b % 10 + "");
//            }
//            b /= 10;
//        }











    }

}
