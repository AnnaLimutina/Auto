package JavaAdvance;

public class Task3 {
    static int number = 1;
    public static void taskNumber() {
        System.out.println("\n________________________________\nTask number " + number + "\n");
        number++;
    }

    public static void main(String[] args) {
        //1
        taskNumber();

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

        //2
        taskNumber();

        array = new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6};

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            }
        System.out.println("Max value is " + max);

        //3
        taskNumber();

        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min value is " + min);

        //4
        taskNumber();
        int arrayIndex = 0;
        sum = 0;
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            arrayIndex++;
        }
        System.out.println("Average value is " + sum/arrayIndex);

        //5
        taskNumber();
        int[][] arrayMany = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        sum = 0;

        for (int i = 0; i < arrayMany.length; i++) {
            for (int a = 0; a < arrayMany[i].length; a++) {
                sum += arrayMany[i][a];
            }
        }
        System.out.println("Sum is " + sum);

        //6
        taskNumber();
        arrayMany = new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        max = arrayMany[0][0];

        for (int i = 0; i < arrayMany.length; i++) {
            for (int a = 0; a < arrayMany[i].length; a++){
                if (max < arrayMany[i][a]) {
                    max = arrayMany[i][a];
                }
            }
        }
        System.out.println("Max value from array is " + max);

        //7
        taskNumber();

        arrayIndex = 0;
        int s = 0;
        for (int i = 0; i < arrayMany.length; i++){
            for (int a: arrayMany[i]){
                arrayIndex++;
            }
            }
        System.out.println("Number of elements in the array is " + arrayIndex);

        //8



        }




        }







