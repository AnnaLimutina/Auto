package Olga.lesson8;

public class Person implements Jacket, Trousers, Shoes {
    private String name;
    private String jacket;
    private String trousers;
    private String shoes;

    Person(String name, String jacket, String trousers, String shoes){
        this.jacket = jacket;
        this.name = name;
        this.shoes =shoes;
        this.trousers = trousers;
    }


    @Override
    public void putOnJacket() {
        System.out.println(this.name + " надел " + this.jacket + " жакет");

    }

    @Override
    public void takeOffJacket() {
        System.out.println(this.name + " снял " + this.jacket + " жакет");
    }

    @Override
    public void putOnShoes() {
        System.out.println(this.name + " обул " + this.shoes + " обувь");
    }

    @Override
    public void takeOffShoes() {
        System.out.println(this.name + " снял " + this.shoes + " обувь");
    }

    @Override
    public void putOnTrousers() {
        System.out.println(this.name + " надел " + this.trousers + " штаны");
    }

    @Override
    public void takeOffTrousers() {
        System.out.println(this.name + " снял " + this.trousers + " штаны");
    }

    public void getDressed(){
        this.putOnJacket();
        this.putOnTrousers();
        this.putOnShoes();
    }

    public void undress(){
        this.takeOffJacket();
        this.takeOffTrousers();
        this.takeOffShoes();
    }
}
