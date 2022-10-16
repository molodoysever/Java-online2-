package ua.lyashko.lesson14.task2;

import java.util.Arrays;

public class UtilGenericClass {
    public static <T> void print (T t) {
        System.out.println ("***{" + t + "}***" );
    }

    public <T> void showArr (T[] arr) {
        System.out.println ( Arrays.toString ( arr ) );
    }

    public static void main ( String[] args ) {
        Integer[] integers = {1,3,5};
        print ( 1 );
        UtilGenericClass utilGenericClass = new UtilGenericClass ();
        utilGenericClass.showArr ( integers );
    }
}
