package Olga.lesson7;

public class MilitaryTransport extends AirTransport{
    protected boolean ejectionSystem;
    protected int rocketsNumber;

    MilitaryTransport(int capacity, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength,
                      boolean ejectionSystem, int rocketsNumber) {
        super(capacity, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.rocketsNumber = rocketsNumber;
    }

    public void description(){
        System.out.println("The transport:\nBrand: " + this.brand + ",\nWeight, kg: " + this.weight + ",\nMaximal speed, km/hour: " +
                this.maxSpeed + ",\nCapacity, horsepower: " + this.capacity + ",\nWingspan, m: " + this.wingspan +",\nMinimum length of runway for setting off: " +
                this.minRunwayLength + ",\n System of ejection is available: " + this.ejectionSystem + ",\nNumber of rockets: " + this.rocketsNumber +
                ",\nCapacity, kv: " + (int)(this.capacity * 0.74));
    }
    public void doShot(){
        if (this.rocketsNumber > 0){
            System.out.println("Ракета пошла…");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }
    public void ejection(){
        if (this.ejectionSystem){
            System.out.println("“Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
