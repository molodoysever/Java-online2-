package ua.lyashko.lesson21;

import java.lang.reflect.Field;
import java.util.Objects;

public class CarUtil {

    public static void getterCar ( Car car , String value ) {
        Class<? extends Car> carClass = car.getClass ( );
        try {
            Field field = carClass.getDeclaredField ( value );
            if (checkGetter ( field )) {
                field.setAccessible ( true );
                String carName = (String) field.get ( car );
                System.out.println ( carName );
            }
        } catch ( NoSuchFieldException | IllegalAccessException e ) {
            e.printStackTrace ( );
        }
    }

    public static void setterCar ( Car car , String carName , String carFuel ) {
        Class<? extends Car> carClass = car.getClass ( );
        try {
            Field name = carClass.getDeclaredField ( "name" );
            if (checkSetter ( name )) {
                name.setAccessible ( true );
                name.set ( car , carName );
            }

            Field fuel = carClass.getDeclaredField ( "fuel" );
            if (checkSetter ( fuel )) {
                fuel.setAccessible ( true );
                fuel.set ( car , carFuel );
            }
            System.out.println ( car );
        } catch ( NoSuchFieldException | IllegalAccessException e ) {
            e.printStackTrace ( );
        }
    }

    public static void validateField ( Car car , String value ) {
        Class<? extends Car> carClass = car.getClass ( );
        try {
            Field field = carClass.getDeclaredField ( value );
            if (field.isAnnotationPresent ( Validate.class )) {
                field.setAccessible ( true );
                Validate annotation = field.getDeclaredAnnotation ( Validate.class );
                String temp = (String) field.get ( car );

                if (!Objects.equals ( temp , annotation.compareValue ( ) )) {
                    System.out.println ( "validation passed" );
                    System.out.println ( "prime value: " + temp );
                    System.out.println ( "compare value: " + annotation.compareValue ( ) );
                }
            }
        } catch ( NoSuchFieldException | IllegalAccessException e ) {
            e.printStackTrace ( );
        }
    }

    public static boolean checkGetter ( Field field ) {
        return field.isAnnotationPresent ( GetterCar.class );
    }

    public static boolean checkSetter ( Field field ) {
        return field.isAnnotationPresent ( SetterCar.class );
    }
}
