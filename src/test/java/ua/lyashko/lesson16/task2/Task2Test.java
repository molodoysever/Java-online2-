package ua.lyashko.lesson16.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


class Task2Test {
    List<String> list = new ArrayList<> ( );

    @Test
    void stringListToMapWithKeyInteger () {
        list.add ( "java" );
        Assertions.assertEquals ( Map.of (4, List.of ( "java" )), Task2.stringListToMapWithKeyInteger ( list ) );
    }

    @Test
    void stringListToMapWithSeveralValues () {
        list.add ( "java" );
        list.add ( "JAVA" );
        list.add ( "c++" );
        Assertions.assertEquals ( Map.of ( 4,List.of ("java" , "JAVA" ), 3, List.of ( "c++" ) ),
                Task2.stringListToMapWithKeyInteger ( list ) );
    }

    @Test
    void emptyStringListToMap () {
        list.add ( "" );
        Assertions.assertEquals ( Map.of (0, List.of ( "" )), Task2.stringListToMapWithKeyInteger ( list ) );
    }
}