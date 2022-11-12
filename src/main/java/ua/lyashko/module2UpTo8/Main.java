package ua.lyashko.module2UpTo8;

import java.io.IOException;

public class Main {
    public static void main ( String[] args ) {
        Sawmill sawmill = new Sawmill ( "Sawmill","John",  2000);
        Carpentry carpentry = new Carpentry ("Carpentry","Dan",  1550 );
        Pipeline pipeline = new Pipeline ( "Pipeline","Stan",3020  );

        try {
            FactoryLine.factory ( sawmill,carpentry,pipeline );
        } catch ( IOException e ) {
            e.printStackTrace ( );
        }
    }
}