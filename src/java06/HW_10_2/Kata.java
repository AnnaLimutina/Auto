package java06.HW_10_2;

public class Kata {
    public static String position(char alphabet)
    {
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++){
            if (str.toLowerCase().charAt(i) == alphabet){
                return "Position of alphabet: " + (i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(position('j'));
    }
}
