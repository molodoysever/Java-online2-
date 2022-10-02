package ua.lyashko.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main ( String[] args ) {
        Random random = new Random ( );
        int a = random.nextInt ( 10);
        boolean lessOrMore = util (a);
        System.out.println (lessOrMore );
    }

    public static boolean util ( int a) {
        Scanner scanner = new Scanner ( System.in );
        int b;
        do {
            System.out.println ( "Введите число" );
            b = scanner.nextInt ( );
            if (a > b) {
                System.out.println ( "Мало" );
            } else if (a < b) {
                System.out.println ( "Много" );
            } else {
                return true;
            }
        } while ( true );
    }
}
