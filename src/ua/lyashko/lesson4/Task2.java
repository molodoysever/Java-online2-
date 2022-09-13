package ua.lyashko.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main ( String[] args ) {
        Random random = new Random ( );
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt ( 100 );
            if (isPrime ( arr [i] )) {
                System.out.println ( arr[i] + " is prime" );
            }
        }
        System.out.println ( Arrays.toString ( arr ) );
    }


    private static boolean isPrime(int number) {
        int temp;
        if (number <= 1) return false;
        for (int i = 2; i <= number / 2; i++) {
            temp = number % i;
            if (temp == 0) return false;
        }
        return true;
    }
}
