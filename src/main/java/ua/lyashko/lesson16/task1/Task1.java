package ua.lyashko.lesson16.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {

    public static Map<String, Integer> stringListToMapWithKeyString ( List<String> list ) {
        Map<String, Integer> map = new HashMap<> ( );
        for (String i : list) {
            map.put ( i , i.length ( ) );
        }
        return map;
    }
}
