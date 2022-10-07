package ua.lyashko.lesson12.task1;

public class Main {
    public static void main ( String[] args ) {
        try {
            doAction ( 0 );
        } catch ( MyException e ) {
            e.printStackTrace ( );
        } finally {
            System.out.println ( "here we go" );
        }
    }

    public static int doAction ( int number ) throws MyException {
        if (number == 0) {
            throw new MyException ( "better then null" );
        }
        return number + 2;
    }
}

