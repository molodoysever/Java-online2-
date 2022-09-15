package ua.lyashko.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Practice_Task2 {
    public static void main ( String[] args ) {
        int[] goods = new int[12];
        fillArray ( goods );
        System.out.println ( Arrays.toString ( goods ) );
        System.out.println ("average sum: " + findAvgSum ( goods ));
    }

    public static int findAvgSum (int[] goods) {
        int sum = 0;
        for (int i : goods) {
            if (i > 1000) {
                sum += i;
            }
        }
        return sum;
    }

    public static void fillArray(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(5000);
        }
    }
}
