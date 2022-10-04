package ua.lyashko.lesson11.task2;

public class Main {
    public static void main ( String[] args ) {
        Passenger[] passengers = new Passenger[4];
        passengers[0] = new Passenger ( "John" );
        passengers[1] = new Passenger ( "Mark" );
        passengers[2] = new Passenger ( "Jack" );
        passengers[3] = new Passenger ( "Sara" );

        PassengerCar passengerCar = new PassengerCar ( "bmw" , 2022 , "green" ,
                55 , 25 , 7 , passengers );

        passengerCar.showStat ( );
        passengerCar.checkPassengerIntoCar ( );
        passengerCar.isMoving ( passengerCar.getCurrentFuel ( ) );
        passengerCar.showStat ( );


        Truck truck = new Truck ( "scania" , 2015 , "black" ,
                250 , 4 , 30 , 80 );

        truck.showStat ( );
        truck.cargoCheck ( );
        truck.isMoving ( truck.getCurrentFuel ( ) );
        truck.refuel ( );
        truck.showStat ( );
    }
}
