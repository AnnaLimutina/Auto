package java06.HW_7_1;

public class Employee {
    String name;
    int age;
    char sex;
    double salary;

    public boolean isSameName(Employee employee){
        return this.name.equals(employee.name);
    }

    /*
    public boolean isSameName(Employee employee){
        if(this.name.equals(employee.name){
            return true;
        } else {
            return false;
        }
    }
     */


}
