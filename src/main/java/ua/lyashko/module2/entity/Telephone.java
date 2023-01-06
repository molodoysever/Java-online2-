package ua.lyashko.module2.entity;


public class Telephone extends Goods {
    String model;

    public Telephone ( String series , String model , String screenType , int price ) {
        super ( series , screenType , price );
        this.model = model;
    }

    public String getModel () {
        return model;
    }

    public void setModel ( String model ) {
        this.model = model;
    }

    @Override
    public String toString () {
        return "Telephone{" +
                "series='" + series + '\'' +
                ", screenType='" + screenType + '\'' +
                ", price='" + price + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}