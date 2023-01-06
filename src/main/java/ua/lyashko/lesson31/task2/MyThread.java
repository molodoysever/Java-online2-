package ua.lyashko.lesson31.task2;

import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class MyThread extends Thread {
    Counter counter;
    int number;

    public MyThread ( Counter counter ) {
        this.counter = counter;
    }


    @Override
    public void run () {
        while ( counter.getCounter ( ) < 1 ) {
            counter.increaseCounter ( );
            number = counter.count ( );
            System.out.println ( number );
        }
    }
}
