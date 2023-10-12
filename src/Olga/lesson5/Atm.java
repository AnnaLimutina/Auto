package Olga.lesson5;

public class Atm {

    private int banknote20;
    private int banknote50;
    private int banknote100;

    private int sum;

    Atm(int banknote100, int banknote50, int banknote20){
        if (banknote20 >= 0 && banknote50 >= 0 && banknote100 >= 0){
            this.banknote20 = banknote20;
            this.banknote50 = banknote50;
            this.banknote100 = banknote100;
            sum = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
            System.out.printf("Your balance is %d\n", sum);
        } else {
            System.out.println("Amount of banknotes can be equal to zero or bigger");
        }
    }

    public void getBalance(){
        sum = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
        System.out.printf("Your balance is %d\n", sum);
    }

    public void getMoney(int amount){
        if (amount <= sum){
            if (amount % 20 == 0 || amount % 50 == 0){
                int am = amount;
                int b100 = am / 100;
                banknote100 -= b100;
                am -= b100 * 100;
                int b50 = am / 50;
                banknote50 -= b50;
                am -= b50 * 50;
                int b20 = am / 20;
                banknote20 -= b20;
                sum = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
                System.out.printf("Successful operation. \nYou got %d banknotes 100, %d banknotes 50 and %d banknotes 20.\n "
                        + "Your current balance is %d. \nYou have banknotes 100: %d, banknotes 50: %d and banknotes 20: %d\n",
                        b100, b50, b20, sum, banknote100, banknote50, banknote20);
            } else {
                System.out.println("The ATM only dispenses banknotes in denominations of 20, 50 and 100");
            }

        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void topUpMoney(int amount){
        if (amount % 20 == 0 || amount % 50 == 0){
            int am = amount;
            int b100 = am / 100;
            banknote100 += b100;
            am -= b100 * 100;
            int b50 = am / 50;
            banknote50 += b50;
            am -= b50 * 50;
            int b20 = am / 20;
            banknote20 += b20;
            sum = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
            System.out.printf("Successful operation.\n You added %d: \n %d banknotes 100, \n %d banknotes 50, "
                            + "\n %d banknotes 20,\n Your current balance is %d. \nYou have banknotes 100: %d, "
                            + "banknotes 50: %d and banknotes 20: %d\n",
                    amount, b100, b50, b20, sum, banknote100, banknote50, banknote20);
        } else {
            System.out.println("The ATM can only accept banknotes in denominations of 20, 50 and 100");
        }

    }

}
