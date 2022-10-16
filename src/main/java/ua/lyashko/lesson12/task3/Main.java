package ua.lyashko.lesson12.task3;

public class Main {
    public static void main ( String[] args ) {
        Thrower thrower = new Thrower ( );
        try {
            thrower.f ( );
        } catch ( Ex1 | Ex2 | Ex3 e ) {
            e.printStackTrace ( );
        }
    }
}

class Thrower {
    void f () throws Ex1, Ex2, Ex3 {
        try {
            throw new Ex1 ( );
        } catch ( Ex1 ex1 ) {
            ex1.printStackTrace ( );
        }
        try {
            throw new Ex2 ( );
        } catch ( Ex2 ex2 ) {
            ex2.printStackTrace ( );
        }
        try {
            throw new Ex3 ( );
        } catch ( Ex3 ex3 ) {
            ex3.printStackTrace ( );
        }
    }
}

class Ex1 extends Exception {
}

class Ex2 extends Exception {
}

class Ex3 extends Exception {
}
