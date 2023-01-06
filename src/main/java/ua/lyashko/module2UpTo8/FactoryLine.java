package ua.lyashko.module2UpTo8;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FactoryLine {

    public static void factory ( Sawmill sawmill , Carpentry carpentry , Pipeline pipeline ) throws IOException {
        long start;
        long finish;

        FileWriter fileWriter = new FileWriter ( "log.txt" , true );

        sawmill.requiredTime ( );
        carpentry.requiredTime ( );
        pipeline.requiredTime ( );

        sawmill.doWork ( );
        start = System.currentTimeMillis ( );
        sawmill.sawTree ( );
        finish = System.currentTimeMillis ( ) - start;

        isBusyCheck ( sawmill.getRequiredTime (),start );

        fileWriter.write ( "\n" );
        fileWriter.write ( String.valueOf ( sawmill ) );
        fileWriter.write ( String.valueOf ( start ) );
        fileWriter.write ( String.valueOf ( finish ) );
        fileWriter.flush ( );

        carpentry.doWork ( );
        start = System.currentTimeMillis ( );

        isBusyCheck ( carpentry.getRequiredTime ( ) , start);

        carpentry.fixRoof ( );
        finish = System.currentTimeMillis ( ) - start;

        fileWriter.write ( "\n" );
        fileWriter.write ( String.valueOf ( carpentry ) );
        fileWriter.write ( String.valueOf ( start ) );
        fileWriter.write ( String.valueOf ( finish ) );
        fileWriter.flush ( );

        isBusyCheck ( pipeline.getRequiredTime (), start );

        pipeline.doWork ( );
        start = System.currentTimeMillis ( );
        pipeline.layPipes ( );
        finish = System.currentTimeMillis ( ) - start;

        fileWriter.write ( "\n" );
        fileWriter.write ( String.valueOf ( pipeline ) );
        fileWriter.write ( String.valueOf ( start ) );
        fileWriter.write ( String.valueOf ( finish ) );
        fileWriter.flush ( );

        LocalDateTime date = LocalDateTime
                .ofInstant ( Instant.ofEpochMilli ( start ) , ZoneId.systemDefault ( ) );

        fileWriter.write ( "\n" );
        fileWriter.write ( ("Last date: " +  date ) );
        fileWriter.flush ( );
    }

    public static void isBusyCheck ( long number, long start ) throws IOException {
        FileWriter fileWriter = new FileWriter ( "log.txt" , true );
        long temp = System.currentTimeMillis ( ) - start;
        if (temp < number) {
            long wait = number - temp;
            String error = "line is busy";

            try {
                System.out.println ( error );
                fileWriter.write ( "\n" );
                fileWriter.write ( error );
                fileWriter.close ();

                Thread.sleep ( wait );

            } catch ( InterruptedException e ) {
                e.printStackTrace ( );
            }
        }
    }
}
