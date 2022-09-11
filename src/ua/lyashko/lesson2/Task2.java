package ua.lyashko.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        System.out.println ("Enter A x1:" );
        double x1 = scanner.nextDouble ();

        System.out.println ("Enter A y1:" );
        double y1 = scanner.nextDouble ( );

        System.out.println ("Enter B x2:" );
        double x2 = scanner.nextDouble ();

        System.out.println ("Enter B y2:" );
        double y2 = scanner.nextDouble ( );

        System.out.println ("Enter C x3:" );
        double x3 = scanner.nextDouble ( );

        System.out.println ("Enter C y3:" );
        double y3 = scanner.nextDouble ( );

        calculate ( x1,x2, x3, y1, y2, y3 );
    }

    public static void calculate (double x1, double x2, double x3, double y1, double y2, double y3) {

        double square = (x1 * (y2 - y3) + x2 * ( y3 - y1 ) + x3 * ( y1 - y2 )) / 2;

        System.out.println ("Square is: " + square );
    }
}
