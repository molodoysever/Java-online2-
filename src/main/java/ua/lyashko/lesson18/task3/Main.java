package ua.lyashko.lesson18.task3;

import java.util.List;
import java.util.Locale;


public class Main {
    public static void main ( String[] args ) {
        List<String> dates = List.of ( "1999/12/01" , "2022/10/22" , "2000/09/16" );

        System.out.println ( stringToDate ( dates ) );
        System.out.println ( haveDate ( stringToDate ( dates ) ) );
    }

    private static boolean haveDate ( List<Locale> list ) {
        return list.stream ( )
                .anyMatch ( it -> it.toString ( )
                        .contains ( "2022" ) );
    }

    private static List<Locale> stringToDate ( List<String> list ) {
        return list.stream ( )
                .map ( Locale::new )
                .toList ( );
    }
}
