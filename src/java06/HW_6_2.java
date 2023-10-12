package java06;

public class HW_6_2 {

    public static void main(String[] args) {
        task4();
    }

    private static void task4() {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;
        int str = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                str++;
                for (int l = 0; l < array[i][j].length(); l++){
                    if (array[i][j].charAt(l) == 'е'){
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(str - count);

    }

    private static void task3() {
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        int index = s.indexOf("рит");
        while (index != -1) {
            System.out.println(index);
            index = s.indexOf("рит", index + 1);
        } ;


    }

    private static void task2() {
        String s = "Перевыборы выбранного президента";
        int count = 0;


        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'е'){
                count++;
            }
        }
        System.out.println(count);
    }

    private static void task1() {
        String s = "Перестановочный алгоритм быстрого действия";
        char[] newS =  s.toCharArray();
        for (char c : newS) {
            if (c == 'о') {
                System.out.println(c);
            }
        }

    }

}
