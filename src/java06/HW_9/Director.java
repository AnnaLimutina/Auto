package java06.HW_9;

public class Director extends BaseManager {


    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public double getSalary(){
        if (getNumberOfSubordinates() == 0){
            return getBaseSalary();
        } else {
            return getBaseSalary() + (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 9.0));
        }
    }
}
