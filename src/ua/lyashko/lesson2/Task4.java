package ua.lyashko.lesson2;

import java.util.Scanner;

public class Task4 {
    public static void calculateModule (float num1, float num2, float num3) {
        float absA = num1 < 0 ? num1 * -1 : num1;
        float absB = num2 < 0 ? num2 * -1 : num2;
        float absC = num3 < 0 ? num3 * -1 : num3;

        if (absA <= absB && absA <= absC) {
            System.out.println("Наименьшим числом по модулю является: " + num1);
        } else if (absB <= absA && absB <= absC){
            System.out.println ("Наименьшим числом по модулю является:" + num2);
        } else {
            System.out.println ("Наименьшим числом по модулю является:" + num3);
        }
    }

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        System.out.println ( "Enter num1: " );
        float num1 = scanner.nextFloat ( );

        System.out.println ( "Enter num2: " );
        float num2 = scanner.nextFloat ( );

        System.out.println ( "Enter num3: " );
        float num3 = scanner.nextFloat ( );

        calculateModule (num1, num2, num3);
    }
}
