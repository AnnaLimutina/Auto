package Olga.lesson6;

import java.util.Random;

public class Student {
    private String surname;
    private int group;
    private int[] performance = new int[5];
    Student(String surname, int group, int firstMark, int secondMark, int thirdMark, int forthMark, int fifthMark){
        this.surname = surname;
        this.group = group;
        this.performance[0] = firstMark;
        this.performance[1] = secondMark;
        this.performance[2] = thirdMark;
        this.performance[3] = forthMark;
        this.performance[4] = fifthMark;
    }
    public static void getExcellentStudents(Student[] arr){
        System.out.println("Отличники:");
        for (Student a:arr
             ) {
            if ((a.performance[0] == 10 || a.performance[0] == 9) && (a.performance[1] == 10 || a.performance[1] == 9)
            && (a.performance[2] == 10 || a.performance[2] == 9) && (a.performance[3] == 10 || a.performance[3] == 9)
            && (a.performance[4] == 10 || a.performance[4] == 9)) {
                System.out.println(a.surname + ", Group number: " + a.group + ";");
            }
        }
    }


}
