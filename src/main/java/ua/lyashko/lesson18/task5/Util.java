package ua.lyashko.lesson18.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Util {
    public static Boolean isSuitable ( int minSizeLimit , int size ) {
        return minSizeLimit < size;
    }

    public static List<Item> createItemList () {
        List<Item> itemList = new ArrayList<> ( );
        Random random = new Random ( );
        for (int i = 0; i < random.nextInt ( 10 ); i++) {
            itemList.add ( new Item ( "abc" , random.nextInt ( 100 ) ) );
        }
        return itemList;
    }

    public static void fillBoxList ( List<Box> boxList ) {
        Random random = new Random ( );
        for (int i = 0; i < 10; i++) {
            boxList.add ( new Box ( Util.createItemList ( ) , random.nextInt ( 10 ) ) );
        }
    }
}
