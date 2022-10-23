package ua.lyashko.lesson15.task3;

import java.util.Comparator;

public class BoxComparator implements Comparator<Box> {
    public int compare ( Box box1 , Box box2 ) {
        if (box1.getVolume ( ) == 0 && box2.getVolume ( ) != 0) {
            return -1;
        } else if (box1.getVolume ( ) == 0 && box2.getVolume ( ) == 0) {
            return 0;
        } else if (box1.getVolume ( ) != 0 && box2.getVolume ( ) == 0) {
            return 1;
        } else return box2.getVolume ( ).compareTo ( box1.getVolume ( ) );
    }
}
