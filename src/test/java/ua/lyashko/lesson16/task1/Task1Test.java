package ua.lyashko.lesson16.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    List<String> list = new ArrayList<> ( );

    @Test
    void stringListToMapWithKeyString () {
        list.add ( "hello" );
        Assertions.assertEquals ( Map.of ( "hello" , 5 ) , Task1.stringListToMapWithKeyString ( list ) );
    }

    @Test
    void emptyStringListToMap () {
        list.add ( "" );
        Assertions.assertEquals ( Map.of ( "" , 0 ) , Task1.stringListToMapWithKeyString ( list ) );
    }
}