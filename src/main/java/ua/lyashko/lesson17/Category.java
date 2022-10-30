package ua.lyashko.lesson17;

public class Category {
    String name;
    Long categoryId;

    public Category ( String name , Long categoryId ) {
        this.name = name;
        this.categoryId = categoryId;
    }

    public Long getCategoryId () {
        return categoryId;
    }

    @Override
    public String toString () {
        return "Category{" +
                "name='" + name + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}
