package Olga.lesson7;

public class GroundTransport extends Transport{

    protected int wheelsAmount;
    protected int fuelConsumption;

    GroundTransport(int capacity, int maxSpeed, int weight, String brand, int wheelsAmount, int fuelConsumption) {
        super(capacity, maxSpeed, weight, brand);
        this.fuelConsumption = fuelConsumption;
        this.wheelsAmount = wheelsAmount;
    }
    public void description(){
        System.out.println("The transport:\nBrand: " + this.brand + ",\nWeight, kg: " + this.weight + ",\nMaximal speed, km/hour: " +
                this.maxSpeed + ",\nCapacity, horsepower: " + this.capacity + ",\nAmount of wheels: " + this.wheelsAmount +
                ",\nFuel consumption: " + this.fuelConsumption);
    }
}
