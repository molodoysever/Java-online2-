package ua.lyashko.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main ( String[] args ) {
        int[] arr = new int[1000];
        fillArray ( arr );
        System.out.println (countPrimeNumbers ( arr ) );
        System.out.println ( Arrays.toString ( arr  ) );
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

    public static int countPrimeNumbers(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (isPrime ( j )) {
                count++;
            }
        }
        return count;
    }

    public static void fillArray(int[] arr) {
        Random random = new Random ( );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt ( 100 );
        }
    }
}
