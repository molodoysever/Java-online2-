package ua.lyashko.lesson5;

import java.util.Arrays;

public class Task1 {
    public static void main ( String[] args ) {
        int [][] arr = new int[4][4];
        fillArray ( arr );
        System.out.println(Arrays.deepToString(arr).replace("], ", "]" +
                "\n").replace("[[", "[").replace("]]", "]"));
    }

    public static void fillArray (int[][] arr){
        int count = 1;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]= count;
                count++;
                if (i % 2 == 1 ) {
                    arr[i][j]= -arr[i][j];
                }
            }
        }
    }
}
