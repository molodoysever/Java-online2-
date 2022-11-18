package ua.lyashko.lesson21;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main ( String[] args ) {
        Main main = new Main ( );
        Car car = new Car ( );

        String fuel = "500";

        main.setterCar ( car , "name" , "BMW" );
        main.setterCar ( car , "fuel" , "200" );

        main.getterCar ( car , "name" );
        main.getterCar ( car , "fuel" );

        main.validate ( car , "fuel" , fuel );
    }

    @Getter
    public void getterCar ( Object obj , String varName ) {
        try {
            PropertyDescriptor pd = new PropertyDescriptor ( varName , obj.getClass ( ) );
            Method getter = pd.getReadMethod ( );
            Object o = getter.invoke ( obj );
            System.out.println ( o );
        } catch ( IntrospectionException | InvocationTargetException | IllegalAccessException e ) {
            e.printStackTrace ( );
        }
    }

    @Setter
    public void setterCar ( Object obj , String propName , Object value ) {
        try {
            PropertyDescriptor pd = new PropertyDescriptor ( propName , obj.getClass ( ) );
            Method setter = pd.getWriteMethod ( );
            try {
                setter.invoke ( obj , value );
            } catch ( InvocationTargetException | IllegalAccessException e ) {
                e.printStackTrace ( );
            }
        } catch ( IntrospectionException e ) {
            e.printStackTrace ( );
        }
    }

    @Validate
    public void validate ( Object obj , String value , String compareValue ) {
        try {
            PropertyDescriptor pd = new PropertyDescriptor ( value , obj.getClass ( ) );
            Method getter = pd.getReadMethod ( );
            Object o = getter.invoke ( obj );
            boolean b = compareValue.equals ( o );
            System.out.println ( b );
        } catch ( IntrospectionException | InvocationTargetException | IllegalAccessException e ) {
            e.printStackTrace ( );
        }
    }
}
