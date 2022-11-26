package ua.lyashko.lesson21;

public class Car {
    @GetterCar
    @SetterCar
    @Validate (compareValue = "JEEP")
    private final String name;

    @GetterCar
    @SetterCar
    @Validate (compareValue = "1000")
    private final String fuel;

    public Car ( String name , String fuel ) {
        this.name = name;
        this.fuel = fuel;
    }

    @Override
    public String toString () {
        return "Car{" +
                "name='" + name + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
