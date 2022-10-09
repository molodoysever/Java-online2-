package ua.lyashko.lesson11.task2;

import java.util.Arrays;

public class PassengerCar extends Car implements Recovery {
    private final Object[] seats;

    public PassengerCar ( String series , int year , String colour ,
                          int tankSize , int currentFuel , int fuelConsumption, Object[] seats) {
        super ( series , year , colour , tankSize , currentFuel , fuelConsumption );
        this.seats = seats;
    }


    public void getPassengerOnSeats (Passenger[] passengers, Object[] seats) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == null) {
                seats[i] = passengers[i];
            } else {
                System.out.println ("no seats available" );
            }
        }
        System.out.println ("passengers loaded" );
    }

    public Object[] getSeats () {
        return seats;
    }

    @Override
    void showStat () {
        System.out.println ( " series: " + getSeries ( ) + " year: " + getYear ( ) + " colour: "
                + getColour ( ) + " tank size: " + getTankSize ( ) + " current fuel: " + getCurrentFuel ( ) +
                " fuel consumption: " + getFuelConsumption ( ) + " seats: " + Arrays.toString ( getSeats ( ) ) );
    }

    @Override
    public void refuel () {
        setCurrentFuel ( getTankSize ( ) );
        System.out.println ( "vehicle is refueled" );
    }
}
