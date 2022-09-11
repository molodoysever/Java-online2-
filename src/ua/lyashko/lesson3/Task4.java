package ua.lyashko.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {


    public static void main ( String[] args ) {
        Random random = new Random ( );
        Scanner scanner = new Scanner ( System.in );
        util ( scanner, random);
    }

    public static void util (Scanner scanner, Random random) {
        int a = random.nextInt ( 10);
        int b;
        do {
            System.out.println ("Введите число" );
            b = scanner.nextInt ( );
            if (a > b ) {
                System.out.println ("Мало" );
            } else if (a < b ) {
                System.out.println ("Много" );
            } else {
                System.out.println ("Угадал " + a );
            }
        } while ( b != a );
    }
}
