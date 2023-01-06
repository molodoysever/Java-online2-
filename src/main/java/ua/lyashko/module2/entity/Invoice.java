package ua.lyashko.module2.entity;

import ua.lyashko.module2.Type;
import ua.lyashko.module2.entity.Customer;
import ua.lyashko.module2.entity.Goods;

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

    public List<Goods> getGoods () {
        return goods;
    }

    public void setGoods ( List<Goods> goods ) {
        this.goods = goods;
    }

    public Customer getCustomer () {
        return customer;
    }

    public void setCustomer ( Customer customer ) {
        this.customer = customer;
    }

    public Type getType () {
        return type;
    }

    public void setType ( Type type ) {
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
