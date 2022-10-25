package ua.lyashko.lesson17;

import java.math.BigDecimal;

public class Product {
    String name;
    BigDecimal price;
    Category category;

    public Product ( String name , BigDecimal price , Category category ) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public BigDecimal getPrice () {
        return price;
    }

    public Category getCategory () {
        return category;
    }

    @Override
    public String toString () {
        return '\n' + "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
