package java06.HW_8_1;

public class Manager extends Employee{

    private int amountOfEmployee;

    public int getAmountOfEmployee() {
        return amountOfEmployee;
    }

    public void setAmountOfEmployee(int amountOfEmployee) {
        this.amountOfEmployee = amountOfEmployee;
    }

    public double getSalary(int days){
        double salary = getSalaryPerDay() * days;
        return salary + ((salary * 0.01) * amountOfEmployee);
    }

}
