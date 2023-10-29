package Olga.lesson9;

import java.util.Scanner;

public class StringBuild {
    public static void getShorterString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many strings do you want to create?");
        int amountString = sc.nextInt();
        String[] stringArr = new String[amountString];

        for (int i = 1; i <= amountString; i++){
            System.out.println("Enter " + i + " row:");
            stringArr[i-1] = sc.next();
            System.out.println("The " + i + " row is " + stringArr[i-1]);
        }
        System.out.println(stringArr.toString());

        int min = 0;
        int max = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].length() >= stringArr[max].length()) {
                max = i;
            }

            if (stringArr[i].length() < stringArr[min].length()){
                min = i;
            }
        }
        StringBuilder a = new StringBuilder();
        a.append("The longest row is ").append(stringArr[max].toString()).append(" and the shortest row is ").append(stringArr[min].toString());
        System.out.println(a);


    }
    public static void getAverageString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many strings do you want to create?");
        int amountString = sc.nextInt();
        String[] stringArr = new String[amountString];

        int average;
        int sum = 0;

        for (int i = 1; i <= amountString; i++){
            System.out.println("Enter the " + i + " row: ");
            stringArr[i-1] = sc.next();
            System.out.println("The " + i + " row is " + stringArr[i-1]);
        }
        System.out.println();

        for (String s : stringArr) {
            sum += s.length();
        }
        StringBuilder result = new StringBuilder();
        result.append("Rows: ");
        average = sum / 2;
        for (int i = 0; i < stringArr[i].length(); i++){
            if (stringArr[i].length() > average){
                result.append(stringArr[i]).append(" ");
            }
        }

        }
//    Считайте с клавиатуры три строки. А затем:
//            1. Выведите на экран третью строку в неизменном виде.
//            2. Выведите на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
//            3. Выведите на экран первую строку, предварительно преобразовав ее к нижнему регистру.
public static void getChangeString(){
    Scanner sc = new Scanner(System.in);
    String[] stringArr = new String[3];

    int average;
    int sum = 0;

    for (int i = 1; i <= 3; i++){
        System.out.println("Enter the " + i + " row: ");
        stringArr[i-1] = sc.next();
        System.out.println("The " + i + " row is " + stringArr[i-1]);
    }
    System.out.println();

    for (String s : stringArr) {
        sum += s.length();
    }
    StringBuilder row1 = new StringBuilder();
    StringBuilder row2 = new StringBuilder();

    System.out.println(stringArr[2].toString());
    row2.append(stringArr[1].toUpperCase());
    System.out.println(row2);
    row1.append(stringArr[0].toLowerCase());
    System.out.println(row1);

}
 public static String[] getSnakeCaseFromCamelCase(String[] arrayOfVariable){
        String[] newArrayOfVariables = new String[arrayOfVariable.length];
     for (int i = 0; i < arrayOfVariable.length; i++) {
         char[] b = arrayOfVariable[i].toCharArray();
         for (int j = 0; j < b.length; j++){
             if (Character.isUpperCase(b[j])){
                 newArrayOfVariables[i] = (arrayOfVariable[i].substring(0, arrayOfVariable[i].indexOf(arrayOfVariable[i].charAt(j))) + "_"
                         + arrayOfVariable[i].substring(arrayOfVariable[i].indexOf(arrayOfVariable[i].charAt(j))).toLowerCase());
             }
         }

         System.out.println(newArrayOfVariables[i]);
     }
     return newArrayOfVariables;
 }

 public static String changeWorldToLetter(String string){

        StringBuilder result = new StringBuilder();

     result.append(string);
     int index = result.indexOf("world");
     int lastIndex = result.lastIndexOf("world");
        result.delete(index, index + 5);
        result.insert(index, "letter");
     System.out.println(result);
        return String.valueOf(result);
 }

 public static int findAmountOfDigits(String string){
        char[] chars = string.toCharArray();
        int amount = 0;
     for (char a : chars
          ) {
         if (Character.isDigit(a)){
             amount++;
         }
     }
     return amount;
 }
    public static int findAmountOfLetters(String string){
        char[] chars = string.toCharArray();
        int amount = 0;
        for (char a : chars
        ) {
            if (Character.isLetter(a)){
                amount++;
            }
        }
        return amount;
    }

    public static String deleteExtraSpaces(String string){
        StringBuilder str = new StringBuilder();
           str.append(string.trim());

        for (int i = 0; i < str.length() - 1; i++){
            while (str.charAt(i + 1) == ' ' && str.charAt(i) == ' '){
                str.deleteCharAt(i);            }
        }
        System.out.println(str);
        return String.valueOf(str);
    }









    public static void main(String[] args) {
        //StringBuild.getShorterString();
        //StringBuild.getAverageString();
        //StringBuild.getChangeString();
        //String[] arrayOfVariable = {"helloWorld", "misterProper", "variableString", "stringVariable"};
        //StringBuild.getSnakeCaseFromCamelCase(arrayOfVariable);
        //StringBuild.deleteExtraSpaces("     My     kitten   is sleeping     else  ");
        //StringBuild.changeWorldToLetter("My world is beautiful");
    }


}
