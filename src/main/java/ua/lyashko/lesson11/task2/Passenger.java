package ua.lyashko.lesson11.task2;

public class Passenger {
    private final String name;

    public Passenger ( String name ) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "Passenger{" +
                "name='" + name + '\'' +
                '}';
    }
}