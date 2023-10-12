package java06.HW_8_1;

public class Employee {
    private static int numberEmployee = 0;
    private String name;
    private int age;
    private String sex;
    private double salaryPerDay;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
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

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public double getSalary(int days){
        return this.salaryPerDay * days;
    }

    public Employee(){
        numberEmployee++;
    }
    public int getNumberEmployee(){
        return numberEmployee;
    }
}
