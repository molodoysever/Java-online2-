package ua.lyashko.lesson3;


import java.util.Scanner;

public class Task3 {
    Scanner scanner = new Scanner ( System.in );
    String line = scanner.nextLine ( );

    public static void main ( String[] args ) {
        Task3 str = new Task3 ();
        str.count ();
    }

    public void count ( ) {
        int count = 0;
        if (line.length () != 0) {
            count++;
        }
        for ( int i = 0; i < line.length (); i++) {
            if (line.charAt ( i ) == ' ') {
                count++;
            }
        }
        System.out.println ( "Words: " + count );
    }
}
