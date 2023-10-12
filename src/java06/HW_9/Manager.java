package java06.HW_9;

public class Manager extends BaseManager {



    public Manager(String name, double baseSalary, int numberOfSubordinates){
        super(name, baseSalary, numberOfSubordinates);
    }



    public double getSalary(){
        if (getNumberOfSubordinates() == 0){
            return getBaseSalary();
        } else {
            return getBaseSalary() + (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3.0));
        }
    }
}
