package ua.lyashko.module2.entity;

import ua.lyashko.module2.entity.Goods;

public class Television extends Goods {
    int diagonal;
    String country;


    public Television ( String series , int diagonal , String screenType , String country , int price ) {
        super ( series , screenType , price );
        this.diagonal = diagonal;
        this.country = country;
    }

    public int getDiagonal () {
        return diagonal;
    }

    public void setDiagonal ( int diagonal ) {
        this.diagonal = diagonal;
    }

    public String getCountry () {
        return country;
    }

    public void setCountry ( String country ) {
        this.country = country;
    }

    @Override
    public String toString () {
        return "Television{" +
                "series='" + series + '\'' +
                ", screenType='" + screenType + '\'' +
                ", price='" + price + '\'' +
                ", diagonal=" + diagonal +
                ", country='" + country + '\'' +
                '}';
    }
}