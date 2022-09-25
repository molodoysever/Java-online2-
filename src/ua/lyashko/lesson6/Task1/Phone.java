package ua.lyashko.lesson6.Task1;

public class Phone {
    int number;
    String model;
    int weight;
    String name = "Jack";

    public Phone ( int number , String model , int weight ) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone ( int number , String model ) {
        this.number = number;
        this.model = model;
    }

    public Phone () {
    }

    public void receiveCall( String name) {
        System.out.println ("Call: " + name );
    }

    public void getNumber() {
        System.out.println (number);
    }
}
