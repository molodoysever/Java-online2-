package ua.lyashko.lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ("Enter a number:" );
        double a = scanner.nextDouble ( );
        boolean isEven = dividesByTwo (a);
        System.out.println ("Number " + a + " is even: " + isEven );
    }

    public static boolean dividesByTwo(double a) {
        return a % 2 == 0;
    }
}

