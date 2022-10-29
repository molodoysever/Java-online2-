package ua.lyashko.lesson18.task5;

import java.util.List;

public class Box {
    List<Item> itemList;
    int size;

    public Box ( List<Item> itemList , int size ) {
        this.itemList = itemList;
        this.size = size;
    }

    public List<Item> getItemList () {
        return itemList;
    }

    public int getSize () {
        return size;
    }


    @Override
    public String toString () {
        return '\n' + "Box{" +
                "itemList=" + itemList +
                ", size=" + size +
                '}';
    }
}
