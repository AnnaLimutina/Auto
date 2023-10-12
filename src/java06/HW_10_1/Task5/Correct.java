package java06.HW_10_1.Task5;

public class Correct {
    public static String correct(String string) {

        String str = string;


            if (str.contains("5")) {
                str = str.replace("5", "S");
            }
            if (str.contains("0")) {
                str = str.replace("0", "O");
            }
            if (str.contains("1")) {
                str = str.replace("1", "I");
            }

        return str;
    }


}
