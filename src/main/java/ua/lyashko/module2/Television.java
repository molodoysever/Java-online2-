package ua.lyashko.module2;

public class Television extends Goods {
    int diagonal;
    String country;


    public Television ( String series , int diagonal , String screenType , String country , int price ) {
        super ( series , screenType , price );
        this.diagonal = diagonal;
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
