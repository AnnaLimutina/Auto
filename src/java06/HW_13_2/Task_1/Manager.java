package java06.HW_13_2.Task_1;

public final class Manager extends BaseEmployee{

    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Manager(String name, int age, String sex, double salaryPerDay, int numberOfSubordinates) {
        super(name, age, sex, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }
    @Override
    public double getSalary(Month[] monthsArray){
        return super.getSalary(monthsArray) + (super.getSalary(monthsArray) * getNumberOfSubordinates()/100);
    }
}
