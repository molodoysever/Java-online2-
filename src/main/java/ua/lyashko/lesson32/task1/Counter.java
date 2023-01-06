package ua.lyashko.lesson32.task1;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Counter implements Runnable {
    private static int counter = 50;
    private final int limit = 250;
    private final int threadPoolSize = 100;
    private static final Object lock = new Object ( );

    @Override
    public void run () {
        increaseCounter ( );
    }

    private void increaseCounter () {
        synchronized (lock) {
            System.out.println ( Thread.currentThread ( ).getName ( ) + " : " + counter );
            counter = counter + 2;
        }
    }
}
