package ua.lyashko.lesson18.task4;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main ( String[] args ) {
        List<Integer> list = fillRandomNumbers ();
        System.out.println (list );
        System.out.println (findMin ( list ) );

    }

    private static int findMin(List<Integer> list) {
        return list.stream ()
                .reduce(Integer.MAX_VALUE, (left, right) -> left < right ? left : right);
    }

    private static List<Integer> fillRandomNumbers () {
        return new Random ( )
                .ints ( 10 , -10 , 10 )
                .boxed ( )
                .toList ( );
    }
}
