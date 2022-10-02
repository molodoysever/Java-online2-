package ua.lyashko.lesson10;

public abstract class Car {
    private final String series;
    private final int year;
    private final String colour;
    private int fuel;

    public void isMoving (int fuel) {
        if ( getFuel () > 0 ) {
            System.out.println ("vehicle is moving" );
        } else if (getFuel () == 0 ) {
            refuel ();
            System.out.println ("vehicle was refueled" );
            System.out.println ("vehicle is moving" );
        }
    }

    abstract void showStat();

    public void refuel () {
        setFuel ( 100 );
    }

    public Car ( String series , int year , String colour , int fuel ) {
        this.series = series;
        this.year = year;
        this.colour = colour;
        this.fuel = fuel;
    }

    public String getSeries () {
        return series;
    }

    public int getYear () {
        return year;
    }

    public String getColour () {
        return colour;
    }

    public int getFuel () {
        return fuel;
    }


    public void setFuel ( int fuel ) {
        this.fuel = fuel;
    }
}