package ua.lyashko.lesson31.task2;

import lombok.Data;

import java.util.List;

@Data
public class Counter {
    List<Integer> list;
    int counter = -1;

    public Counter ( List<Integer> list ) {
        this.list = list;
    }

    private static boolean isPrime ( int number ) {
        int temp;
        if (number <= 1) return false;
        for (int i = 2; i <= number / 2; i++) {
            temp = number % i;
            if (temp == 0) return false;
        }
        return true;
    }

    public synchronized void increaseCounter () {
        counter++;
        System.out.println ( Thread.currentThread ( ).getName ( ) + " " + counter );
    }

    public synchronized int count () {
        int count = 0;
        int temp;
        if (( counter == 0 ) && ( list.size ( ) % 2 != 0 )) {
            for (int i = 0; i < ( list.size ( ) / 2 ) - 1; i++) {
                temp = list.get ( i );
                if (isPrime ( temp )) {
                    count++;
                }
            }
        } else if (counter == 0) {
            for (int i = 0; i < ( list.size ( ) / 2 ); i++) {
                temp = list.get ( i );
                if (isPrime ( temp )) {
                    count++;
                }
            }
        } else if (( counter == 1 ) && ( list.size ( ) % 2 != 0 )) {
            for (int i = ( list.size ( ) / 2 ) - 1; i < list.size ( ); i++) {
                temp = list.get ( i );
                if (isPrime ( temp )) {
                    count++;
                }
            }
        } else if (counter == 1) {
            for (int i = ( list.size ( ) / 2 ); i < list.size ( ); i++) {
                temp = list.get ( i );
                if (isPrime ( temp )) {
                    count++;
                }
            }
        }
        return count;
    }
}
