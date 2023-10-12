package Udemy_java_zaur.lesson5;

public class BankAccount {
    String name;
    double balance;

    double popolnenieScheta(double plusSum) {
        balance += plusSum;
        return balance;
    }

    double sniatieSoScheta(double minusSum){
        balance -= minusSum;
        return balance;
    }

    public static void main(String[] args) {
        BankAccount alex = new BankAccount();
        alex.balance = 1000;
        alex.name = "Alexander";
        alex.popolnenieScheta(110.5);
        System.out.println(alex.balance);
    }
}


