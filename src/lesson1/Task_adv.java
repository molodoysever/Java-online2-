package lesson1;

import java.util.Scanner;

public class Task_adv {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String num = scanner.nextLine ();
        num = reverse ( num );
        System.out.println ( num );
    }
}
