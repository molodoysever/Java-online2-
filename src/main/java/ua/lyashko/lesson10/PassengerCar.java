package ua.lyashko.lesson10;

public class PassengerCar extends Car implements Recovery {
    private int passenger;

    public PassengerCar ( String series , int year ,
                          String colour , int fuel , int passenger ) {
        super ( series , year , colour , fuel );
        this.passenger = passenger;
    }

    public void passengerIntoCar () {
        while ( getPassenger () >= 3 ) {
            setPassenger ( getPassenger () - 1 );
            System.out.println ("passenger unloaded" );
        }
        if (getPassenger () < 3) {
            setPassenger ( getPassenger () + 1 );
            System.out.println ("passenger added" );
        }
    }

    public int getPassenger () {
        return passenger;
    }

    public void setPassenger ( int passenger ) {
        this.passenger = passenger;
    }

    @Override
    void showStat () {
        System.out.println (" series: " + getSeries () + " year: " + getYear () + " colour: "
                + getColour () + " fuel: " + getFuel () + " passenger: " + getPassenger ());
    }

    @Override
    public void refuel () {
        setFuel ( 100 );
    }
}
