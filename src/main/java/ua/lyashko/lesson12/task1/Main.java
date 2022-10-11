package ua.lyashko.lesson12.task1;

public class Main {
    public static void main ( String[] args ) {
        try {
            throw new MyException ( "better then null" );
        } catch ( MyException e ) {
            System.out.println (e.getMessage () );
        } finally {
            System.out.println ( "here we go" );
        }
    }
}
