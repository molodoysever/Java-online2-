package ua.lyashko.module2;

import java.util.List;

public class Invoice {
    List<Goods> goods;
    Customer customer;
    Type type;

    public Invoice ( List<Goods> goods , Customer customer , Type type ) {
        this.goods = goods;
        this.customer = customer;
        this.type = type;
    }

    @Override
    public String toString () {
        return "\nInvoice{" +
                "goods=" + goods +
                ", customer=" + customer +
                ", type=" + type +
                '}';
    }
}
