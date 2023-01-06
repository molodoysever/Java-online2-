package ua.lyashko.module2.entity;

public class Goods {
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

    public String getSeries () {
        return series;
    }

    public void setSeries ( String series ) {
        this.series = series;
    }

    public String getScreenType () {
        return screenType;
    }

    public void setScreenType ( String screenType ) {
        this.screenType = screenType;
    }

    public void setPrice ( Integer price ) {
        this.price = price;
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
