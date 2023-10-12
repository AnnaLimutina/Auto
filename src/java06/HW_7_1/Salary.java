package java06.HW_7_1;

public class Salary {
    double salary;

    public double getSum(Employee[] employeeArray){

        double sum = 0;
        for (Employee i: employeeArray) {
            sum += i.salary;
        }
        return sum;

    }
}
