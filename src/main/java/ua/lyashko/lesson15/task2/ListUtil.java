package ua.lyashko.lesson15.task2;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    public static int getSum ( List<Integer> numbers ) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    public static List<Integer> getOddNumber ( List<Integer> numbers ) {
        ArrayList<Integer> odd = new ArrayList<> ( );
        for (int i : numbers) {
            if (i % 2 != 0) {
                odd.add ( i );
            }
        }
        return odd;
    }

    public static List<String> convertToStringList ( List<Integer> numbers ) {
        ArrayList<String> stringList = new ArrayList<> ( );
        for (Integer i : numbers) {
            String str = i.toString ( );
            stringList.add ( str );
        }
        return stringList;
    }

    public static List<String> doubling ( List<String> strings ) {
        ArrayList<String> stringDoubling = new ArrayList<> ( );
        for (String str : strings) {
            str = str + str;
            stringDoubling.add ( str );
        }
        return stringDoubling;
    }

    public static void main ( String[] args ) {
        List<Integer> numbers = new ArrayList<> ( );
        numbers.add ( 21 );
        numbers.add ( 2 );
        numbers.add ( 13 );

        System.out.println ( getSum ( numbers ) );
        System.out.println ( getOddNumber ( numbers ) );
        System.out.println ( convertToStringList ( numbers ) );
        System.out.println ( doubling ( convertToStringList ( numbers ) ) );
    }
}
