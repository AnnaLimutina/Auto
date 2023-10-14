package Olga.lesson7;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer("hz",250,"hz",3);
        comp1.description();
        comp1.turnDownComputer();
        comp1.startComputer();

        CivilTransport plan = new CivilTransport(250, 500,5,"Boing",3,500,100,true);
        plan.description();
        plan.isLoadAcceptable(250);
        plan.isLoadAcceptable(99);

        FreightTransport truck = new FreightTransport(200,80,3,"Track", 8, 80,15);
        truck.description();
        truck.isLoadAcceptable(15);
        truck.isLoadAcceptable(16);

        MilitaryTransport rac = new MilitaryTransport(500,350,1,"Strela", 1,10,true,3);
        rac.ejection();
        rac.description();
        rac.doShot();

        PassengerTransport car = new PassengerTransport(110,180,3,"Audi", 4,70,"sedan", 5);
        System.out.println(car.countAvailableKm(3));
        car.description();



    }
}
