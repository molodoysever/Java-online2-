package ua.lyashko.lesson19.task1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main ( String[] args ) throws IOException {
        File file = new File ( "src/main/resources/test.csv" );
        Scanner scanner = new Scanner ( System.in );
        writer ( file , reader ( scanner ) );
    }

    private static List<String> reader ( Scanner scanner ) {
        String line = null;
        List<String> strings = new ArrayList<> ( );
        while ( !Objects.equals ( line , "end" ) ) {
            line = scanner.nextLine ( );
            if (line.contentEquals ( "next" )) {
                strings.add ( "\n" );
            } else if (line.contentEquals ( "end" )) {

            } else {
                strings.add ( line );
            }
        }
        return strings;
    }

    private static void writer ( File file , List<String> strings ) {
        try (FileWriter writer = new FileWriter ( file )) {
            writer.write ( String.valueOf ( strings ) );
        } catch ( IOException e ) {
            e.printStackTrace ( );
        }
    }
}