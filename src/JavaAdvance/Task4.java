package JavaAdvance;

public class Task4 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        System.out.println(sumOfTwo(3, 8.8));


    }

    public static double sumOfTwo(double a, double b) {
        return a + b;
    }






    private static void task3() {
        for (int i = 0; i <= 9; i++){
            for (int j = 9; j > 9 - i; j--){
                System.out.print("  ");
            }
            for (int j = 9; j >= i; j--){
                System.out.print(j - i + " ");
            }
            for (int j = 1; j < 10 - i; j++){
                   //1
                    System.out.print(j + " ");

            }
            System.out.println();

        }
//        System.out.println();



    }

    private static void task2() {
        for (int i = 9; i >= 0; i--){
            for (int j = 0; j < 9 - i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    private static void task1() {
        for (int i = 9; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //System.out.println("\n");
    }
}
