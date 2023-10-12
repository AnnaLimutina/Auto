package codeWars;

public class Kata {
    public static String chromosomeCheck(String sperm) {
        if (sperm == "XY") {
            return "Congratulations! You're going to have a son.";
        }
        if (sperm == "XX") {
            return "Congratulations! You're going to have a daughter.";
        }
        return "Error";
    }
}
