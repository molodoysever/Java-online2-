package ua.lyashko.lesson5;

import java.util.Arrays;

public class Task4 {
    public static void main ( String[] args ) {
        int[] arr = {1 , 2 , 3 , 4 ,5};
        System.out.println ( Arrays.toString ( arr ) );
        System.out.println ( Arrays.toString ( removeIndex ( arr, 3 ) ) );
    }

    public static int[] removeIndex ( int[] arr, int removeInd){
        int[] targetArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != removeInd) {
                targetArr[j++] = arr[i];
            }
        }
        return targetArr;
    }
}
