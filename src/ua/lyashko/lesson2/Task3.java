package ua.lyashko.lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ("Enter a number:" );
        double a = scanner.nextDouble ( );
        dividesByTwo (a);
    }

    public static void dividesByTwo(double a) {
        if ( a % 2 == 0 ) {
            System.out.println ("Number " + a + " is even" );
        } else {
            System.out.println ("Number " + a + " is odd" );
        }
    }
}
