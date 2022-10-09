package ua.lyashko.lesson10.task1;

import java.util.Objects;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String group;
    private final double averageMark;

    public Student ( String firstName , String lastName , String group , double averageMark ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getLastName () {
        return lastName;
    }

    public int getScholarship () {
        int scholarship;
        if (averageMark == 5) {
            scholarship = 100;
        } else {
            scholarship = 80;
        }
        return scholarship;
    }

    @Override
    public String toString () {
        return "\n" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                ", averageMark=" + averageMark;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (!( o instanceof Student student )) return false;
        return Double.compare ( student.averageMark , averageMark ) == 0 && firstName.equals ( student.firstName ) && getLastName ( ).equals ( student.getLastName ( ) ) && group.equals ( student.group );
    }

    @Override
    public int hashCode () {
        return Objects.hash ( firstName , getLastName ( ) , group , averageMark );
    }
}
