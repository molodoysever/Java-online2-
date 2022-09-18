package ua.lyashko.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main ( String[] args ) {
        int[] arr = new int[1000];
       fillArray ( arr );
        System.out.println (countCompositeNumbers ( arr ) );
        System.out.println ( Arrays.toString ( arr ) );
    }

    private static boolean isComposite(int number) {
        if (number <= 3) return false;
        if (number % 2 == 0 || number % 3 == 0) return true;
        for (int i = 5; i * i <= number; i = i + 6)
            if (number % i == 0 || number % (i + 2) == 0) return true;
        return false;
    }

    public static int countCompositeNumbers (int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (isComposite ( j )) {
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
