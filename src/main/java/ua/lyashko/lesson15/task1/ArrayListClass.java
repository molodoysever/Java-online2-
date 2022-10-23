package ua.lyashko.lesson15.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
    public static void main ( String[] args ) {
        List<Integer> list = new ArrayList<> ( );

        //* for loop *//
        for (int i = 1; i <= 5; i++) {
            list.add ( i );
        }
        System.out.println ( list );

        //* for each loop *//
        System.out.println ( "for each loop: " );
        for (int value : list) {
            System.out.println ( value );
        }

        //* while loop *//
        System.out.println ( "while loop: " );
        int count = 0;
        while ( list.size ( ) > count ) {
            System.out.println ( list.get ( count ) );
            count++;
        }

        //* iterator *//
        System.out.println ( "iterator: " );
        Iterator<Integer> iterator = list.iterator ( );
        while ( iterator.hasNext ( ) ) {
            System.out.println ( iterator.next ( ) );
        }
    }
}
