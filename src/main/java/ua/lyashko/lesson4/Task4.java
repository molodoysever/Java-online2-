package ua.lyashko.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main ( String[] args ) {
        Random random = new Random (  );
        int[] arr = new int[2_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt ( 100 );
        }
        System.out.println ( Arrays.toString ( arr ) );
        System.out.println ( Arrays.toString ( evenToNull ( arr ) ) );
    }

    public static int[] evenToNull ( int[] arr) {
        int[] targetArr = Arrays.copyOf ( arr, arr.length );
        for (int i = 0; i < targetArr.length; i++){
            if (targetArr[i]% 2 == 0) {
                targetArr[i] = 0;
            }
        }
        return targetArr;
    }
}
