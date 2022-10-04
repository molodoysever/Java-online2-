package ua.lyashko.lesson11.task1;

import ua.lyashko.lesson10.task1.Aspirant;
import ua.lyashko.lesson10.task1.Student;

import java.util.Objects;

public class Main {
    public static void main ( String[] args ) {
        Student student = new Student ("Jake","Bro",
                "1-A", 4);
        Aspirant aspirant = new Aspirant ("Rob", "Green",
                "1-C", 5, "Peep");

        System.out.println (student.equals ( aspirant ) );
        System.out.println (student.hashCode () );
        System.out.println (aspirant.hashCode () );
    }

    Student student = new Student ( "A", "B",
            "C", 5);

    Aspirant aspirant = new Aspirant ( "B", "C",
            "A",5, "japan");

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (!( o instanceof Main main )) return false;
        return student.equals ( main.student ) && aspirant.equals ( main.aspirant );
    }

    @Override
    public int hashCode () {
        return Objects.hash ( student , aspirant );
    }
}
