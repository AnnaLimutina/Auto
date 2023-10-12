package java06.HW_13_2.Task_1;

public abstract class BaseEmployee {
    private String name;
    private int age;
    private String sex;
    private double salaryPerDay;

    public BaseEmployee(String name, int age, String sex, double salaryPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }
    public double getSalary(Month[] monthsArray){
        double salary = 0.0;
        for (Month a: monthsArray){
            salary += (a.getWorkingDaysAmount()* getSalaryPerDay());
        }
        return salary;
    }
}
