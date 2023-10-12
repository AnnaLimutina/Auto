package Olga.lesson5;

public class Computer {

    private double price;
    private String name;
    private RAM ram;
    private HDD hdd;

    Computer(double price, String name, String ramName, double ramVolume, String hddName, double hddVolume,String hddType){
        this.price = price;
        this.name = name;
        this.ram = new RAM(ramName, ramVolume);
        this.hdd = new HDD(hddName, hddVolume, hddType);

    }
    Computer(double price,String name){
        this.name = name;
        this.price = price;
    }

    public void printComputerInfo(){
        System.out.println(price + " " + name + " " + ram.getName() + " " + ram.getVolume() + " " + hdd.getName() +
                " " + hdd.getVolume() + " " + hdd.getType());
    }




}

class RAM{
    private String name;
    private double volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    RAM(String name, double volume){
        this.name = name;
        this.volume = volume;
    }

}

class HDD{
    private String name;
    private double volume;
    private String type;

    HDD(String name, double volume, String type){
        this.name = name;
        this.volume = volume;
        if(type.equals("internal")){
            this.type = type;
        } else if (type.equals("external")) {
            this.type = type;
        } else {
            System.out.println("type can be only internal or external");
        } ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
