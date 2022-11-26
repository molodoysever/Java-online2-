package ua.lyashko.lesson21;


public class Main {
    public static void main ( String[] args ) {
        Car car = new Car ( "bmw" , "200" );

        CarUtil.validateField ( car, "name" );
        CarUtil.getterCar ( car, "fuel" );
        CarUtil.setterCar ( car , "AUDI" , "300" );

    }
}
