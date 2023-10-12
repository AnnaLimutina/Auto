package Olga.lesson6;

public class Rectangle extends Triangle{


    Rectangle(int sideOne, int sideTwo) {
        super(sideOne, sideTwo);
    }
    public int getSquare(){
        System.out.println("The square is: " + sideOne * sideTwo);
        return sideOne * sideTwo;
    }
}
