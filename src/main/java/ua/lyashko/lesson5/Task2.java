package ua.lyashko.lesson5;

import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main ( String[] args ) {
        Integer[] arr = {6 ,5 , 4 , 3 , 2 ,1 , 2};
        System.out.println ( Arrays.toString ( arr ) );
        System.out.println ( isDescendingCheck ( arr ) );
    }

    public static Integer[] descendingSort ( Integer[] arr ) {
        Integer[] targetArr = Arrays.copyOf ( arr, arr.length );
        Arrays.sort ( targetArr, Collections.reverseOrder () );
        return targetArr;
    }

    public static boolean isDescendingCheck ( Integer[] arr ) {
        return Arrays.equals ( arr, descendingSort ( arr ) );
    }
}
