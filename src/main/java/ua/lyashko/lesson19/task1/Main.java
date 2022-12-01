package ua.lyashko.lesson19.task1;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) throws IOException {
        File file = new File ( "src/main/resources/test.csv" );
        Scanner scanner = new Scanner ( System.in );
        writer ( file , scanner );
    }

    private static String reader ( Scanner scanner ) {
        String line = null;
        line = scanner.nextLine ( );
        return line;
    }

    private static void writer ( File file , Scanner scanner ) {
        try (FileWriter writer = new FileWriter ( file )) {
            String line = null;
            while ( !Objects.equals ( line , "end" ) ) {
                line = reader ( scanner );
                if (line.contentEquals ( "next" )) {
                    writer.write ( "\n" );
                } else {
                    writer.write ( line );
                }
            }
        } catch ( IOException e ) {
            e.printStackTrace ( );
        }
    }
}