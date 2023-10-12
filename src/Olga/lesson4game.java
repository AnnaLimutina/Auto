package Olga;

import java.util.Scanner;

public class lesson4game {
    public static void main(String[] args) {
        game();
    }

    static int[][] arr = new int[3][3];
    static int numberOneFirstPerson;
    static int numberTwoFirstPerson;
    static int numberOneSecondPerson;
    static int numberTwoSecondPerson;
    static int win = 0;

    public static void takeCellsCoordinatesFromFirstPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("The fist person, enter cell coordinates (two numbers from 1 till 3): ");
        numberOneFirstPerson = sc.nextInt();
        numberTwoFirstPerson = sc.nextInt();
    }
    public static void takeCellsCoordinatesFromSecondPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("The second person, enter cell coordinates (two numbers from 1 till 3): ");
        numberOneSecondPerson = sc.nextInt();
        numberTwoSecondPerson = sc.nextInt();
    }
    public static void fillCellFromFirstPerson(){
        if (numberOneFirstPerson < 1 || numberOneFirstPerson > 3 || numberTwoFirstPerson < 1 || numberTwoFirstPerson > 3) {
            System.out.println("The numbers are not correct!! Please, enter correct two numbers from 1 by 3: ");
            takeCellsCoordinatesFromFirstPerson();
            fillCellFromFirstPerson();
        } else if (arr[numberOneFirstPerson-1][numberTwoFirstPerson-1] != 0){
            System.out.println("The sell is occupied!! Please, enter another two numbers: ");
            takeCellsCoordinatesFromFirstPerson();
            fillCellFromFirstPerson();
        } else  {
            arr[numberOneFirstPerson - 1][numberTwoFirstPerson - 1] = 1;
        }


    }
    public static void fillCellFromSecondPerson(){
        if (numberOneSecondPerson < 1 || numberOneSecondPerson > 3 || numberTwoSecondPerson <1 || numberTwoSecondPerson > 3) {
            System.out.println("The numbers are not correct!! Please, enter correct two numbers from 1 by 3: ");
            takeCellsCoordinatesFromSecondPerson();
            fillCellFromSecondPerson();
        } else if (arr[numberOneSecondPerson-1][numberTwoSecondPerson-1] != 0){
            System.out.println("The sell is occupied!! Please, enter another two numbers: ");
            takeCellsCoordinatesFromSecondPerson();
            fillCellFromSecondPerson();
        } else  {
            arr[numberOneSecondPerson - 1][numberTwoSecondPerson - 1] = 2;
        }
    }

    public static void defineWinner(){
        if ((arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1) ||
                (arr[0][2] == 1 && arr[1][1] == 1 && arr[2][0] == 1) ||
                (arr[0][1] == 1 && arr[1][1] == 1 && arr[2][1] == 1) ||
                (arr[1][0] == 1 && arr[1][1] == 1 && arr[1][2] == 1)){
            System.out.println("The firs person has won!!!");
            win += 1;
        } else if ((arr[0][0] == 2 && arr[1][1] == 2 && arr[2][2] == 2) ||
                (arr[0][2] == 2 && arr[1][1] == 2 && arr[2][0] == 2) ||
                (arr[0][1] == 2 && arr[1][1] == 2 && arr[2][1] == 2) ||
                (arr[1][0] == 2 && arr[1][1] == 2 && arr[1][2] == 2)){
            System.out.println("The second person has won!!!");
            win += 2;
        }
    }
    public static void step(){
        takeCellsCoordinatesFromFirstPerson();
        fillCellFromFirstPerson();
        defineWinner();
        takeCellsCoordinatesFromSecondPerson();
        fillCellFromSecondPerson();
        defineWinner();
    }


    public static void game() {
        do {
            step();
        } while (win == 0);







    }

}
