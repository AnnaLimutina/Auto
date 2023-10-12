package JavaAdvance;

public class Person {
    static String name;
    static int age;
    static char sex;
    private static int yearOfBirth;

    public  Person(String name, int age, char sex, int yearOfBirth){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
    }
    

    public static String getName(){
        if (sex == 'M'){
            return "Mr. " +  name;
        } else {
            return "Ms " + name;
        }
    }

}
