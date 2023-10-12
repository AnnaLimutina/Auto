package java06.HW_8_2;

public class Director extends BaseManager{


    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public double getSalaryManager(){
        if (getNumberOfSubordinates() == 0){
            return getBaseSalary();
        } else {
            return getBaseSalary() + (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 9.0));
        }
    }
}
