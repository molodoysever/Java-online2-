package ua.lyashko.lesson16.task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task3 {

    public static void addMillionElementsToList ( List<Integer> list ) {
        for (int i = 0; i <= 1_000_000; i++) {
            list.add ( i );
        }
    }

    public static void getRandomElementFromListMillionTimes ( List<Integer> list ) {
        for (int i = 0; i <= 1_000_000; i++) {
            list.get ( (int) ( Math.random ( ) * list.size ( ) - 1 ) );
        }
    }


    public static void main ( String[] args ) {
        List<Integer> arrayList = new ArrayList<> ( );
        List<Integer> linkedList = new LinkedList<> ( );

        addMillionElementsToList ( arrayList );
        addMillionElementsToList ( linkedList );

        long start = System.currentTimeMillis ( );
        getRandomElementFromListMillionTimes ( arrayList );
        System.out.println ( System.currentTimeMillis ( ) - start );

        start = System.currentTimeMillis ( );
        getRandomElementFromListMillionTimes ( linkedList );
        System.out.println ( System.currentTimeMillis ( ) - start );

    }
}
