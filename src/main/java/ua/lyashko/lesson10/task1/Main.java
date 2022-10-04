package ua.lyashko.lesson10.task1;

import java.util.Arrays;

public class Main {
    public static void main ( String[] args ) {
        Student[] students = new Student[5];
        students[0] = new Student ( "Alex" , "Paul" ,
                "3-G" , 5 );
        students[1] = new Aspirant ( "John" , "Beast" ,
                "4-F" , 3 , "work" );
        students[2] = new Student ( "Darwin" , "Nunez" ,
                "1-D" , 1 );
        students[3] = new Aspirant ( "Kevin" , "De Bruyne" ,
                "10-A" , 5 , "pass" );
        students[4] = new Student ( "Jack" , "Brown" ,
                "5-B" , 5 );

        System.out.println ( Arrays.toString ( students ) );

        for (Student student : students) {
            System.out.println ( "scholarship is: " + student.getLastName ( ) + " "
                    + student.getScholarship ( ) );
        }
    }
}