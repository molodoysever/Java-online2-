package ua.lyashko.lesson3;

import java.util.Scanner;

public class Task2 {

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String line = scanner.nextLine ( );
        detector ( deleteSpace ( line ) );
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
        if(line.equals(data)){
            System.out.println("Given String is palindrome " + line);
            return true;
        } else{
            System.out.println("Given String is not palindrome " + line);
            return false;
        }
    }
}
