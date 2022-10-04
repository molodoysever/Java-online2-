package ua.lyashko.lesson11.task2;

import java.util.Arrays;

public class PassengerCar extends Car implements Recovery {
    private Passenger[] maxPassengers;

    public PassengerCar ( String series , int year , String colour ,
                          int tankSize , int currentFuel , int fuelConsumption , Passenger[] maxPassengers ) {
        super ( series , year , colour , tankSize , currentFuel , fuelConsumption );
        this.maxPassengers = maxPassengers;
    }


    public void checkPassengerIntoCar () {
        while ( getMaxPassengers ( ).length > 3 ) {
            setMaxPassengers ( passengerRemove ( maxPassengers ) );
            System.out.println ( "passenger unloaded" );
        }
        if (getMaxPassengers ( ).length < 3) {
            setMaxPassengers ( passengerAdd ( maxPassengers ) );
            System.out.println ( "passenger added" );
        }
    }

    public Passenger[] getMaxPassengers () {
        return maxPassengers;
    }

    public void setMaxPassengers ( Passenger[] maxPassengers ) {
        this.maxPassengers = maxPassengers;
    }

    public Passenger[] passengerRemove ( Passenger[] passengers ) {
        return Arrays.copyOf ( passengers , passengers.length - 1 );
    }

    public Passenger[] passengerAdd ( Passenger[] passengers ) {
        return Arrays.copyOf ( passengers , passengers.length + 1 );
    }

    @Override
    void showStat () {
        System.out.println ( " series: " + getSeries ( ) + " year: " + getYear ( ) + " colour: "
                + getColour ( ) + " tank size: " + getTankSize ( ) + " current fuel: " + getCurrentFuel ( ) +
                " fuel consumption: " + getFuelConsumption ( ) + " passenger: " + Arrays.toString ( getMaxPassengers ( ) ) );
    }

    @Override
    public void refuel () {
        setCurrentFuel ( getTankSize ( ) );
        System.out.println ( "vehicle is refueled" );
    }
}
