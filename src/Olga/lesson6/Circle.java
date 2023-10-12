package Olga.lesson6;

public class Circle extends Figure{

        Circle(int sideOne) {
        super(sideOne);
    }

    @Override
    public int getSquare() {
        System.out.println("The square is: " + 3.14 * (sideOne * 2));
        return (int)(3.14 * (sideOne * 2));
    }

}
