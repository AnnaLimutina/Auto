package Olga.lesson7;

public class Transport {
    protected int capacity;
    protected int maxSpeed;
    protected int weight;
    protected String brand;

    Transport(int capacity, int maxSpeed, int weight, String brand){
        this.brand = brand;
        this.capacity = capacity;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public void description(){
        System.out.println("The transport:\nBrand: " + this.brand + ",\nWeight, kg: " + this.weight + ",\nMaximal speed, km/hour: " +
                this.maxSpeed + ",\nCapacity, horsepower: " + this.capacity + ".");
    }
}
