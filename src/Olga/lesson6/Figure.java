package Olga.lesson6;

public class Figure {
    protected int sideOne;

    Figure(int sideOne){
        this.sideOne = sideOne;
    }

    public int getSquare(){
        System.out.println("Square is: " + 2 * sideOne);
        return 2 * sideOne;
    }
}
