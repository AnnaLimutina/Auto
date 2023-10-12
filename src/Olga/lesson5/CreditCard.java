package Olga.lesson5;

public class CreditCard {
    private int accountNumber;
    private double amount;

    CreditCard(int accountNumber, double amount){
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void increaseAmount(double increasingAmount) {
    amount = amount + increasingAmount;
    }

    public void reduceAmount(double reducingAmount){
       amount -= reducingAmount;
    }

    public void getAmountInfo(){
        System.out.println("Amount of " + accountNumber + " is " + amount);
    }

}
