package ua.lyashko.lesson18.task2;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main ( String[] args ) {
        List<Integer> list = fillRandomNumbers ( );
        list.forEach ( System.out::println );

        IntSummaryStatistics stat = list.stream ( )
                .filter ( it -> it >= 0 )
                .mapToInt ( Integer::intValue )
                .summaryStatistics ( );
        System.out.println ( stat );

    }

    private static List<Integer> fillRandomNumbers () {
        return new Random ( )
                .ints ( 10 , -10 , 10 )
                .boxed ( )
                .toList ( );
    }
}
