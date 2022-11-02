package ua.lyashko.lesson19.task2;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main ( String[] args ) {
        Gson gson = new Gson ();

        try (Reader reader = new FileReader ( "box.json" )) {

            Box box = gson.fromJson ( reader, Box.class );
            System.out.println (box );

        } catch ( IOException e ) {
            e.printStackTrace ( );
        }
    }
}
