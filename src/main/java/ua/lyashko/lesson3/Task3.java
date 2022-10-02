package ua.lyashko.lesson3;


import java.util.Scanner;

public class Task3 {

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String line = scanner.nextLine ( );
        int counter = countWords ( line );
        System.out.println ("Words: " + counter );
    }

    public static int countWords ( String line ) {
        int count = 0;
        if (line.length () != 0) {
            count++;
        }
        for ( int i = 0; i < line.length (); i++) {
            if (line.charAt ( i ) == ' ') {
                count++;
            }
        } return count;
    }
}
