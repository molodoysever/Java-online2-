package ua.lyashko.lesson10.task1;

import java.util.Objects;

public class Aspirant extends Student {
    private final String scientificWork;

    public Aspirant ( String firstName , String lastName , String group ,
                      double averageMark , String scientificWork ) {
        super ( firstName , lastName , group , averageMark );
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship () {
        return super.getScholarship ( ) + 100;
    }

    @Override
    public String toString () {
        return super.toString ( ) +
                " scientificWork='" + scientificWork + '\'';
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (!( o instanceof Aspirant aspirant )) return false;
        return scientificWork.equals ( aspirant.scientificWork );
    }

    @Override
    public int hashCode () {
        return Objects.hash ( scientificWork );
    }
}
