package ua.lyashko.lesson12.task2;

import ua.lyashko.lesson12.task1.MyException;

public class ThrowFG {
    public void f () {
        try {
            g ( );
        } catch ( MyException e ) {
            try {
                throw new MyException ( "throw f() exception" );
            } catch ( MyException ex ) {
                ex.printStackTrace ( System.err );
            }
        }
    }

    public void g () throws MyException {
        throw new MyException ( "throw g() exception" );
    }
}
