package ua.lyashko.lesson11.task2;

public abstract class Car {
    private final String series;
    private final int year;
    private final String colour;
    private final int tankSize;
    private int currentFuel;
    private int fuelConsumption;


    public void move ( ) {
        if (getCurrentFuel ( ) > getFuelConsumption ( )) {
            System.out.println ( "vehicle is moving" );
            setCurrentFuel ( getCurrentFuel ( ) - getFuelConsumption ( ) );
        } else {
            System.out.println ( "tank is empty" );
        }
    }

    abstract void showStat ();

    public Car ( String series , int year , String colour , int tankSize , int currentFuel , int fuelConsumption ) {
        this.series = series;
        this.year = year;
        this.colour = colour;
        this.tankSize = tankSize;
        this.currentFuel = currentFuel;
        this.fuelConsumption = fuelConsumption;
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

    public int getTankSize () {
        return tankSize;
    }

    public int getCurrentFuel () {
        return currentFuel;
    }

    public int getFuelConsumption () {
        return fuelConsumption;
    }

    public void setCurrentFuel ( int currentFuel ) {
        this.currentFuel = currentFuel;
    }

    public void setFuelConsumption ( int fuelConsumption ) {
        this.fuelConsumption = fuelConsumption;
    }
}