package Olga.lesson6;

public class Test1 {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void outputNumber(){
            System.out.println("Numbers of Test1: " + getNum1() + ", " + getNum2());
    }

    public int sumNumbers(){
        return num2 + num1;
    }
    public int getBiggerNumber(){
        if (num1 >= num2) {
            return num1;
        } else {
            return num2;
        }
    }

}
