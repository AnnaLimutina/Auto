package Udemy_java_zaur;

public class lesson6 {

      void sum(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        System.out.println(sum);
    }
    void sum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }
    void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    void sum(int a) {
        int sum = a;
        System.out.println(sum);
    }
    void sum() {
        int sum = 0;
        System.out.println(sum);
    }

}
class Summ{
    public static void main(String[] args) {
        lesson6 l = new lesson6();
        l.sum();
        l.sum(5);
        l.sum(5,8);
        l.sum(5, 8, 12);
        l.sum(5, 8, 12, 22);
    }



}
