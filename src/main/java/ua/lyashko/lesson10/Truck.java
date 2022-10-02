package ua.lyashko.lesson10;

public class Truck extends Car implements Recovery{
    private int cargo;


    public Truck ( String series , int year , String colour ,
                   int fuel, int cargo ) {
        super ( series , year , colour , fuel );
        this.cargo = cargo;
    }

    public void cargoLoading () {
            setCargo ( 100 );
            System.out.println ("cargo loaded" );
    }

    public void cargoUnloading () {
            setCargo ( 0 );
            System.out.println ( "cargo unloaded" );
    }

    public void cargoCheck () {
        if (getCargo () > 0) {
            cargoUnloading ();
        } else if (getCargo () == 0) {
            cargoLoading ();
        }
    }


    public int getCargo () {
        return cargo;
    }

    public void setCargo ( int cargo ) {
        this.cargo = cargo;
    }

    @Override
    public void isMoving (int fuel ) {
        super.isMoving ( fuel / 2 );
    }

    @Override
    void showStat () {
        System.out.println (" series: " + getSeries () + " year: " + getYear () + " colour: " +
                getColour () + " fuel: " + getFuel () + " cargo: " + getCargo ());
    }

    @Override
    public void refuel () {
        setFuel ( 100 );
    }
}
