package ua.lyashko.lesson16.task2;

import java.util.*;

public class Task2 {

    public static Map<Integer, List<String>> stringListToMapWithKeyInteger ( List<String> list ) {
        Map<Integer, List<String>> map = new HashMap<> ( );
        for (String i : list) {
            Integer key = i.length ( );
            if (map.containsKey ( key )) {
                list.add ( i );
            } else {
                list = new ArrayList<> ( );
                list.add ( i );
                map.put ( key , list );
            }
            map.put ( key , list );
        }
        return map;
    }
}
