package Olga.lesson6;

public class Test2 {
    private int num1;
    private int num2;

    Test2() {
    }

    Test2(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getRemainderOfNumbers(){
            return Math.abs(Math.max(num1, num2) - Math.min(num1, num2)) ;
    }
}
