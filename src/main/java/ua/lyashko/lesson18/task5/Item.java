package ua.lyashko.lesson18.task5;

public class Item {
    String name;
    Integer cost;

    public Item ( String name , Integer cost ) {
        this.name = name;
        this.cost = cost;
    }


    public Integer getCost () {
        return cost;
    }

    @Override
    public String toString () {
        return  "Item{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
