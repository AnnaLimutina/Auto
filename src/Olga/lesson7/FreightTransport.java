package Olga.lesson7;

public class FreightTransport extends GroundTransport{

    protected int loadCapacity;

    FreightTransport(int capacity, int maxSpeed, int weight, String brand, int wheelsAmount, int fuelConsumption, int loadCapacity) {
        super(capacity, maxSpeed, weight, brand, wheelsAmount, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }
    public void description(){
        System.out.println("The transport:\nBrand: " + this.brand + ",\nWeight, kg: " + this.weight + ",\nMaximal speed, km/hour: " +
                this.maxSpeed + ",\nCapacity, horsepower: " + this.capacity + ",\nAmount of wheels: " + this.wheelsAmount +
                ",\nFuel consumption: " + this.fuelConsumption + ",\nCapacity of load, t: " + this.loadCapacity +
                ",\nCapacity, kv: " + (int)(this.capacity * 0.74));
    }

    public boolean isLoadAcceptable(int load){
        if (load <= this.loadCapacity){
            System.out.println("Грузовик загружен");
            return true;
        } else {
            System.out.println("“Вам нужен грузовик побольше");
            return false;
        }
    }
}
