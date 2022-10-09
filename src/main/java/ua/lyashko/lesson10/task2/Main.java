package ua.lyashko.lesson10.task2;

public class Main {
    public static void main ( String[] args ) {

        Pow calc = ( number , pow ) -> {
            int result = 1;
            for (int i = 1; i <= pow; i++) {
                result = result * number;
            }
            return result;
        };

        int calculate = calc.pow ( 5 , 4 );
        System.out.println ( calculate );
    }
}