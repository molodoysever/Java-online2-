package ua.lyashko.lesson15.task3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BoxUtil {
    public static void main ( String[] args ) {
        Comparator<Box> comparator = new BoxComparator ();
        Set<Box> boxes = new TreeSet<> (comparator);

        boxes.add ( new Box ( 1 ) );
        boxes.add ( new Box ( 20 ) );
        boxes.add ( new Box ( 11 ) );
        boxes.add ( new Box ( 0 ) );
        boxes.add ( new Box ( 7 ) );
        boxes.add ( new Box ( 14 ) );

        System.out.println (boxes );
    }
}
