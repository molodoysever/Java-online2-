package ua.lyashko.module2;

public abstract class Goods {
    String series;
    String screenType;
    Integer price;

    public Goods ( String series , String screenType , int price ) {
        this.series = series;
        this.screenType = screenType;
        this.price = price;
    }

    public Integer getPrice () {
        return price;
    }


    @Override
    public String toString () {
        return "Goods{" +
                "series='" + series + '\'' +
                ", screenType='" + screenType + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
