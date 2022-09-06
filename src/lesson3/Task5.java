package lesson3;

public class Task5 {
    public static void main ( String[] args ) {
        System.out.println ( power ( 2 , 0 ) );
    }

    public static int power ( int n , int d ) {
        int result = 1;
        for (int i = 1; i <= d; i++) {
            result = result * n;
        }
        return result;
    }
}
