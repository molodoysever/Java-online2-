package ua.lyashko.lesson11.task1;

import ua.lyashko.lesson10.task1.Aspirant;
import ua.lyashko.lesson10.task1.Student;


public class Main {
    public static void main ( String[] args ) {
        Student student = new Student ( "Jake" , "Bro" ,
                "1-A" , 4 );
        Aspirant aspirant = new Aspirant ( "Rob" , "Green" ,
                "1-C" , 5 , "Peep" );

        boolean isHashcodeEquals = student.hashCode ( ) == aspirant.hashCode ( );

        System.out.println ( student.equals ( aspirant ) );
        System.out.println (isHashcodeEquals );
    }
}
