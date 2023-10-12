package java06.HW_7_1;

public class Person {

    String name;
    int age;
    char sex;

    public String getName(){

        if (this.sex == 'F') {
            return "Mrs " + this.name;
        }
        if (this.sex == 'M') {
            return "Mr " + this.name;
        } else {
            return this.name;
        }


    }
}
