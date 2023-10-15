package Olga.lesson8;

public class Main {
    public static void main(String[] args) {
        Person Ann = new Person("Ann", "Zara", "Bershka", "Econica");
        Person Oleg = new Person("Oleg", "Reserved", "Boss", "Nike");
        Person Kate = new Person("Kate", "Mango", "Zara", "Adidas");

        Ann.getDressed();
        Ann.undress();

        Oleg.getDressed();
        Oleg.undress();

        Kate.getDressed();
        Kate.undress();
    }
}
