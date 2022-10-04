package ua.lyashko.lesson10.task1;

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
}
