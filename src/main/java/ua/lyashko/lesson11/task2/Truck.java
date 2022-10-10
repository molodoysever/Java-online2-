package ua.lyashko.lesson11.task2;

public class Truck extends Car implements Recovery {
    private int cargo;

    public Truck ( String series , int year , String colour ,
                   int tankSize , int currentFuel , int fuelConsumption , int cargo ) {
        super ( series , year , colour , tankSize , currentFuel , fuelConsumption );
        this.cargo = cargo;
    }


    public void cargoLoading () {
        setCargo ( 100 );
        System.out.println ( "cargo loaded" );
    }

    public void cargoUnloading () {
        setCargo ( 0 );
        System.out.println ( "cargo unloaded" );
    }

    public void cargoCheck () {
        if (getCargo ( ) > 0) {
            cargoUnloading ( );
        } else if (getCargo ( ) == 0) {
            cargoLoading ( );
        }
    }


    public int getCargo () {
        return cargo;
    }

    public void setCargo ( int cargo ) {
        this.cargo = cargo;
    }

    @Override
    public void move () {
        if (getCurrentFuel ( ) > (getFuelConsumption ( ) * 2 ) ) {
            System.out.println ( "vehicle is moving" );
            setCurrentFuel ( getCurrentFuel ( ) - (getFuelConsumption ( ) * 2) );
        } else {
            System.out.println ( "tank is empty" );
        }
    }

    @Override
    void showStat () {
        System.out.println ( " series: " + getSeries ( ) + " year: " + getYear ( ) + " colour: "
                + getColour ( ) + " tank size: " + getTankSize ( ) + " current fuel: " + getCurrentFuel ( ) +
                " fuel consumption: " + getFuelConsumption ( ) + " cargo: " + getCargo ( ) );
    }

    @Override
    public void refuel () {
        setCurrentFuel ( getTankSize ( ) );
        System.out.println ( "vehicle is refueled" );
    }
}
