package ua.lyashko.lesson18.task1;

import java.util.List;

public class Main {
    public static void main ( String[] args ) {
        List<String> list = List.of ( "John" , "Jack" , "Stas" , "Angular" , "Zendaya" );
        System.out.println ( stringSort ( list ) );
    }

    private static List<String> stringSort ( List<String> list ) {
        return list.stream ( )
                .sorted ( )
                .toList ( );
    }
}
