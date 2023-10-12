package Olga.lesson6;

public class Director implements GetPosition{
    private String position = "Director";


    @Override
    public void getPosition() {
        System.out.println("Positions is " + position);
    }
}
