package lesson2;

import java.util.Scanner;

public class Task4 {
    public void calculateModule () {
        Scanner scanner = new Scanner ( System.in );

        System.out.println ( "Enter num1: " );
        float num1 = scanner.nextFloat ( );

        System.out.println ( "Enter num2: " );
        float num2 = scanner.nextFloat ( );

        System.out.println ( "Enter num3: " );
        float num3 = scanner.nextFloat ( );

        float a1 = num1;
        float a2 = num2;
        float a3 = num3;

        num1 = Math.abs ( num1 );
        num2 = Math.abs ( num2 );
        num3 = Math.abs ( num3 );

        float minModule = num1 < num2 ? ( num1 < num3 ? num1 : num3 ) : ( num2 < num3 ? num2 : num3 );
        if (minModule == Math.abs ( a1 )) {
            System.out.println ( a1 );
        } else if ( minModule == Math.abs ( a2 )) {
            System.out.println ( a2 );
        } else if ( minModule == Math.abs ( a3 )){
            System.out.println ( a3 );
        }
    }

    public static void main ( String[] args ) {
        Task4 module = new Task4 ();
        module.calculateModule ();
    }
}
