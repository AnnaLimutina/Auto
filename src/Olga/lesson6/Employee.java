package Olga.lesson6;

public class Employee implements GetPosition{
    private String position = "Employee";
    public void getPosition() {
        System.out.println("Positions is " + position);
    }
}
