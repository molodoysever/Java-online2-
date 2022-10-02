package ua.lyashko.lesson10;

public class Main {
    public static void main ( String[] args ) {
        PassengerCar passengerCar = new PassengerCar ( "bmw", 2022,
                "green", 50, 5);
        passengerCar.showStat ();
        passengerCar.passengerIntoCar ();
        passengerCar.isMoving ( passengerCar.getFuel ( ) );
        passengerCar.showStat ();

        Truck truck = new Truck ( "scania", 2015, "black", 0, 10 );
        truck.showStat ();
        truck.cargoCheck ();
        truck.isMoving ( truck.getFuel ( ) );
        truck.showStat ();
    }
}
