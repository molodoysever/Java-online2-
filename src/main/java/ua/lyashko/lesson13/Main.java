package ua.lyashko.lesson13;

import java.util.Arrays;

public class Main {
    public static void main ( String[] args ) {
        BubbleSort bubbleSort = new BubbleSort ( );
        BinarySearch binarySearch = new BinarySearch ( );

        int[] arr = {3 , 5 , 7 , 12312 , 234 , 3242 , 231 , 123 , 5566 , 4355 , 9 , 2344};

        System.out.println ( Arrays.toString ( arr ) );
        System.out.println ("Bubble sort: " + Arrays.toString ( bubbleSort.bubbleSort ( arr ) ) );
        System.out.println ("Binary search: " + binarySearch.binarySearch ( arr, 7 ) );
    }
}
