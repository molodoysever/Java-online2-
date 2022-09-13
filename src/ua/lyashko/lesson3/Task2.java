package ua.lyashko.lesson3;

import java.util.Scanner;

public class Task2 {

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String line = scanner.nextLine ( );
        boolean isPalindrome = detector ( deleteSpace ( line ) );
        System.out.println ("Given String is palindrome: " + isPalindrome );
    }

    public static String deleteSpace ( String line ) {
        String lineDelSpace = line.replaceAll ( "\\s" , "" );
        System.out.println ( lineDelSpace );
        return lineDelSpace;
    }

    public static Boolean detector ( String line ) {
        StringBuilder buffer = new StringBuilder ( line );
        buffer.reverse();
        String data = buffer.toString();
        return line.equals ( data );
    }
}
