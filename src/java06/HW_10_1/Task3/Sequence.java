package java06.HW_10_1.Task3;

public class Sequence {
    public static int[] reverse(int n){
        //your code
        int[] arr = new int[n];
        for(int i = 0, j = n; i < n; i++){
            arr[i] = j;
            j--;
        }
        return arr;
    }
}
