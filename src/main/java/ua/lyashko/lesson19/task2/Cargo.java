package ua.lyashko.lesson19.task2;

import com.google.gson.annotations.SerializedName;

public class Cargo {
    private String name;
    @SerializedName ( "class" )
    String cargoClass;

    public Cargo ( String name , String cargoClass ) {
        this.name = name;
        this.cargoClass = cargoClass;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getCargoClass () {
        return cargoClass;
    }

    public void setCargoClass ( String cargoClass ) {
        this.cargoClass = cargoClass;
    }

    @Override
    public String toString () {
        return "Cargo{" +
                "name='" + name + '\'' +
                ", cargoClass='" + cargoClass + '\'' +
                '}';
    }
}
