package java06.HW_8_2;

public class Manager extends BaseManager{



    public Manager(String name, double baseSalary, int numberOfSubordinates){
        super(name, baseSalary, numberOfSubordinates);
    }



    public double getSalaryManager(){
        if (getNumberOfSubordinates() == 0){
            return getBaseSalary();
        } else {
            return getBaseSalary() + (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3.0));
        }
    }
}
