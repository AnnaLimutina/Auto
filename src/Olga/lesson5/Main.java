package Olga.lesson5;





public class Main {


    public static void main(String[] args) {
       CreditCard firstCard = new CreditCard(111,150.4);
       CreditCard secondCard = new CreditCard(222,410.9);
       CreditCard thirdCard = new CreditCard(333,320);

       firstCard.increaseAmount(510.3);
       secondCard.increaseAmount(110);
       thirdCard.reduceAmount(210.3);

       firstCard.getAmountInfo();
       secondCard.getAmountInfo();
       thirdCard.getAmountInfo();

       Computer computer1 = new Computer(11.22, "lenovo");
       Computer computer2 = new Computer(55.22, "axux", "ram1", 55, "hdd1", 44, "internal");

       computer2.printComputerInfo();

       Atm atm1 = new Atm(5, 4, 8);
       atm1.topUpMoney(4500);
       atm1.getMoney(3840);



    }




}
