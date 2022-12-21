package ua.lyashko.lesson31.task2;

import lombok.SneakyThrows;

import java.util.List;

public class Main {
    @SneakyThrows
    public static void main ( String[] args ) {
        List<Integer> list = List.of ( 2 , 23 , 3 , 151 , 73 , 109 , 2 , 2 );
        Counter counter = new Counter ( list );
        MyThread thread1 = new MyThread ( counter );
        MyThread thread2 = new MyThread ( counter );
        thread1.start ( );
        thread2.start ( );
        thread1.join ( );
        thread2.join ( );

        int sum = thread1.number + thread2.number;
        System.out.println ( sum + " " + Thread.currentThread ( ).getName ( ) );

    }
}

