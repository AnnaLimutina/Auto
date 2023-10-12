package java06;

public class HW_6_1 {
    public static void taskNumber(int taskNumber){
        System.out.println("Task # " + taskNumber);
    }

    public static void main(String[] args) {
        task7();

    }

    private static void task7() {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int index = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                index++;
            }
        }
        System.out.println(index);

    }

    private static void task6() {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = array[0][0];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }

    private static void task5() {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }

    private static void task1(){
        taskNumber(1);
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int count = 0;
        for (int i: array){
            count += i;
        }
        System.out.println(count);
    }

    private static void task2(){
        taskNumber(2);
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int max = array[0];
        for (int i: array){
            if (i > max){
                max = i;
            }
        }
        System.out.println(max);

    }

    private static void task4(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;
        for (int i: array){
            sum += i;
        }
        System.out.println(sum / array.length);
    }


}
