package Olga.lesson7;

public class AirTransport extends Transport{

    protected int wingspan;
    protected int minRunwayLength;

    AirTransport(int capacity, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength) {
        super(capacity, maxSpeed, weight, brand);
        this.minRunwayLength = minRunwayLength;
        this.wingspan = wingspan;
    }
    public void description(){
        System.out.println("The transport:\nBrand: " + this.brand + ",\nWeight, kg: " + this.weight + ",\nMaximal speed, km/hour: " +
                this.maxSpeed + ",\nCapacity, horsepower: " + this.capacity + ",\nWingspan, m: " + this.wingspan +",\nMinimum length of runway for setting off: " +
                this.minRunwayLength);
    }
}
