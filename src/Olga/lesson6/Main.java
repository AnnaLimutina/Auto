package Olga.lesson6;

import org.testng.annotations.Test;

public class Main {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.setNum1(9);
        t.setNum2(87);
        System.out.println(t.getBiggerNumber() + ", " + t.sumNumbers());

        Test2 t2 = new Test2(3200, 10);
        System.out.println(t2.getRemainderOfNumbers());

        Student[] psih = {new Student("Limut",6,5,5,7,8,8 ),
                new Student("Seer", 6, 9,9,10,9,9),
                new Student("DFHIK", 6,10,5,9,8,10),
                new Student("SeeHGFfcr", 6,10,9,10,9,9 ),
                new Student("Dhkljlo;k", 6, 8,9,9,9,10),
                new Student("Sfhj", 6, 8,7,9,10,9),
                new Student("Seer", 6, 7,9,9,10,9),
                new Student("Seer", 6,9,9,9,10,9 ),
                new Student("Seer", 6, 7,9,10,9,8),
                new Student("Seer", 6,1,3,5,8,9),
        };
        Student.getExcellentStudents(psih);

        System.out.println("#6\n");

        Figure[] arr = {new Triangle(12,45), new Rectangle(22,50), new Circle(15),
        new Triangle(20, 30), new Rectangle(16, 44)};

       int sum = 0;
        for (Figure a: arr
             ) {
            sum = sum + a.getSquare();
        }
        System.out.println("Sum: " + sum);

        Employee employee = new Employee();
        Director director = new Director();
        Accountant accountant = new Accountant();
        employee.getPosition();
        director.getPosition();
        accountant.getPosition();


    }


}
