package Olga.lesson6;

public class Triangle extends Figure{
    protected int sideTwo;

    Triangle(int sideOne, int sideTwo){
        super(sideOne);
        this.sideTwo = sideTwo;
    }

    @Override
    public int getSquare() {
        System.out.println("The square is: " + (sideTwo + sideOne) / 2);
        return (sideTwo + sideOne) / 2;
    }
}
