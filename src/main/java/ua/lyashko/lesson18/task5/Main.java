package ua.lyashko.lesson18.task5;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;


public class Main {
    @Override
    public String toString () {
        return "Main{}";
    }

    public static void main ( String[] args ) {
        List<Box> boxList = new ArrayList<> ( );
        Util.fillBoxList ( boxList );
        System.out.println ( boxList );
        System.out.println ( "-----------" );

        boxList.stream ( )
                .filter ( it -> Util.isSuitable ( 3 , it.getSize ( ) ) )
                .map ( Box::getItemList )
                .flatMap ( Collection::stream )
                .sorted ( Comparator.comparing ( Item::getCost ) )
                .forEach ( System.out::println );
    }
}
