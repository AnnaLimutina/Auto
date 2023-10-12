package java06.HW_7_2.Task3;

public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Your code goes here. Have fun!
        Fighter f1, f2;
        if (firstAttacker.equals(fighter1.name)) {
            f1 = fighter1;
            f2 = fighter2;
        } else {
            f1 = fighter2;
            f2 = fighter1;
        }
        while (true){
            f2.health -= f1.damagePerAttack;
            System.out.println(f1 + " attacks " + f2 + ". " + f2 + " health = " + f2.health);

            if (f2.health <= 0){
                return f1.name;
            }

            f1.health -= f2.damagePerAttack;
            System.out.println(f2 + " attacks " + f1 + ". " + f1 + " health = " + f1.health);
            if (f1.health <= 0){
                return f2.name;
            }
        }


    }
}
