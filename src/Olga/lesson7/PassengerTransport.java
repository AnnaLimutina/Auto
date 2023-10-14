package Olga.lesson7;

public class PassengerTransport extends GroundTransport{

    protected String bodyType;
    protected int passengersNumber;


    PassengerTransport(int capacity, int maxSpeed, int weight, String brand, int wheelsAmount, int fuelConsumption,
                       String bodyType, int passengersNumber ) {
        super(capacity, maxSpeed, weight, brand, wheelsAmount, fuelConsumption);
        this.bodyType = bodyType;
        this.passengersNumber = passengersNumber;
    }
    public void description(){
        System.out.println("The transport:\nBrand: " + this.brand + ",\nWeight, kg: " + this.weight + ",\nMaximal speed, km/hour: " +
                this.maxSpeed + ",\nCapacity, horsepower: " + this.capacity + ",\nAmount of wheels: " + this.wheelsAmount +
                ",\nFuel consumption, l/100 km: " + this.fuelConsumption + ",\nBody type: " + this.bodyType + ",\nNumber of passengers: " + this.passengersNumber +
                ",\nCapacity, kv: " + (int)(this.capacity * 0.74));
    }
    private int countFuel(int hour){
        return ((hour * this.maxSpeed)/100) * this.fuelConsumption;
    }

    public String countAvailableKm(int hour){
        return "За время " + hour + " часа, автомобиль " + this.brand + " двигаясь с максимальной скоростью " + this.maxSpeed
                + " км/ч проедет " + (hour * this.maxSpeed) + " км и израсходует " + this.countFuel(hour) + " литров топлива";
    }
}
