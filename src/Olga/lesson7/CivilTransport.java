package Olga.lesson7;

public class CivilTransport extends AirTransport{

    protected int passengerNumber;
    protected boolean businessClassIsAvailable;

    CivilTransport(int capacity, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength,
                   int passengerNumber, boolean businessClassIsAvailable) {
        super(capacity, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.businessClassIsAvailable = businessClassIsAvailable;
        this.passengerNumber = passengerNumber;
    }

    public void description(){
        System.out.println("The transport:\nBrand: " + this.brand + ",\nWeight, kg: " + this.weight + ",\nMaximal speed, km/hour: " +
                this.maxSpeed + ",\nCapacity, horsepower: " + this.capacity + ",\nWingspan, m: " + this.wingspan +",\nMinimum length of runway for setting off: " +
                this.minRunwayLength + ",\nNumber of passengers: " + this.passengerNumber + ",\nBusiness class is available: " + this.businessClassIsAvailable +
                ",\nCapacity, kv: " + (int)(this.capacity * 0.74));
    }
    public boolean isLoadAcceptable(int passengers){
        if (passengers <= this.passengerNumber){
            System.out.println("Самолёт загружен");
            return true;
        } else {
            System.out.println("Вам нужен самолёт побольше");
            return false;
        }
    }
}
