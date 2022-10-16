package ua.lyashko.lesson14.task1;

import java.util.Arrays;

public class MySet<T> {
    private final T[] arr;

    public MySet ( T[] arr ) {
        this.arr = arr;
    }

    public T get ( int index ) {
        return arr[index];
    }

    public void add ( T element ) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                break;
            } else if (arr[i] == null) {
                arr[i] = element;
                break;
            }
        }
    }


    @Override
    public String toString () {
        return "MySet{" +
                "arr=" + Arrays.toString ( arr ) +
                '}';
    }

    public static void main ( String[] args ) {
        MySet <Integer> integerMySet = new MySet<> ( new Integer[4] );
        integerMySet.add ( 2 );
        integerMySet.add ( 4 );
        integerMySet.add ( 123 );
        integerMySet.add ( 123 );
        integerMySet.add ( 3 );
        System.out.println (integerMySet.get ( 2) );
        System.out.println (integerMySet );
    }
}
