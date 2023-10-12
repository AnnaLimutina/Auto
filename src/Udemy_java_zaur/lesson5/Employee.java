package Udemy_java_zaur.lesson5;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    double increaseSalary() {
        double inc = salary * 2;
        return inc;
    }
}

    class EmployeeTest {
        public static void main(String[] args) {


        Employee Maks = new Employee();
        Maks.salary = 450.5;
            System.out.println(Maks.increaseSalary());
        Employee Alex = new Employee();
        Alex.salary = 870.1;
            System.out.println(Alex.increaseSalary());

    }}
