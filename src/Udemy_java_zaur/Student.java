package Udemy_java_zaur;

public class Student {

    Student(String name1, String surname1, int yearOfStudying1, double averageMarkMath1, double averageMarkEconomy1,
            double averageMarkForeignLanguage1) {
        name = name1;
        surname = surname1;
        yearOfStudying = yearOfStudying1;
        averageMarkEconomy = averageMarkEconomy1;
        averageMarkMath = averageMarkMath1;
        averageMarkForeignLanguage = averageMarkForeignLanguage1;
    }
    Student(String name2, String surname2, int yearOfStudying2){
        this(name2, surname2, yearOfStudying2,0.0, 0.0, 0.0);
        }

    Student(){
    }

    int studentTicketNumber;
    String name;
    String surname;
    int yearOfStudying;
    double averageMarkMath;
    double averageMarkEconomy;
    double averageMarkForeignLanguage;


    double averM() {
        double averM = (averageMarkEconomy + averageMarkForeignLanguage + averageMarkMath) / 3;
        return averM;
    }
}

    class StudentTest {

        public static void main (String[] args){

        Student Peter = new Student("Peter", "Grizzly", 3, 7.8, 8.7, 5 );
//            Peter.yearOfStudying = 1;
//            Peter.name = "Peter";
//            Peter.surname = "Grizzly";
//            Peter.averageMarkMath = 7;
//            Peter.averageMarkEconomy = 9;
//            Peter.averageMarkForeignLanguage = 7;
        Student Garry = new Student("Garry", "Poter", 2);
//            Garry.yearOfStudying = 2;
//            Garry.name = "Garry";
//            Garry.surname = "Poter";
            Garry.averageMarkMath = 8;
            Garry.averageMarkEconomy = 10;
            Garry.averageMarkForeignLanguage = 9;
        Student Fiona = new Student();
            Fiona.yearOfStudying = 3;
            Fiona.name = "Fiona";
            Fiona.surname = "Luter";
            Fiona.averageMarkMath = 10;
            Fiona.averageMarkEconomy = 7;
            Fiona.averageMarkForeignLanguage = 8;

//            double PeterAverageMark = (Peter.averageMarkMath +
//                    Peter.averageMarkEconomy +
//                    Peter.averageMarkForeignLanguage)/3;
//            double GarryAverageMark = (Garry.averageMarkMath +
//                    Garry.averageMarkEconomy +
//                    Garry.averageMarkForeignLanguage)/3;
//            double FionaAverageMark = (Fiona.averageMarkMath +
//                    Fiona.averageMarkEconomy +
//                    Fiona.averageMarkForeignLanguage)/3;

            System.out.println("Peter average mark: " + Peter.averM());
            System.out.println("Garry average mark: " + Garry.averM());
            System.out.println("Fiona average mark: " + Fiona.averM());
    }
    }

