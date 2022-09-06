package lesson2;

import java.util.Scanner;

public class Task3 {
    public void dividesByTwo() {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ("Enter a number:" );
        double a = scanner.nextDouble ( );
        if ( a % 2 == 0 ) {
            System.out.println ("Number " + a + " is even" );
        } else {
            System.out.println ("Number " + a + " is odd" );
        }
    }

    public static void main ( String[] args ) {
        Task3 number = new Task3 ();
        number.dividesByTwo ();
    }
}
