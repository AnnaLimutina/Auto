package java06;

public class HW_5 {
    public static void main(String[] args) {

        for (int i = 9; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        String space = "  ";
        for (int i = 9; i >= 0; i--){
            for (int j = 0; j < 9 - i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }

        for (int i = 0; i < 10; i++){
            for (int j = 9; j > 9 - i; j--){
                System.out.print(space);
            }
            for (int j = 9; j >= i; j--){
                System.out.print(j -i + " ");
            }
            for (int j = 1; j <= 9 - i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        }
}
