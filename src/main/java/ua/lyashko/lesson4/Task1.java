package ua.lyashko.lesson4;

import java.util.Random;

public class Task1 {
    public static void main ( String[] args ) {
        int [] arr = new int[400];
        fillArray ( arr );
        System.out.println ("Среднее арифм = " + avaregeArr ( arr ) );
        System.out.println ("Среднее геометр = " + averageGeom ( arr ) );
    }


    public static double avaregeArr ( int [] arr ){
        double sumAverage = 0;
        if (arr.length > 0){
            double sum = 0;
            for (int i : arr) {
                sum += i;
            }
            sumAverage = sum / arr.length;
        }
        return sumAverage;
    }

     public static double averageGeom ( int [] arr){
        double sumGeometric = 0;
        if (arr.length > 0){
            double sumGeo = 1;
            for (int i : arr){
                sumGeo = sumGeo * arr[i];
            }
            sumGeometric = Math.pow ( sumGeo, 1.0 / arr.length );
        }
        return sumGeometric;
     }

    public static void fillArray(int[] arr) {
        Random random = new Random ( );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt ( 10 );
        }
    }
}
