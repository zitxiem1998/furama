package model;

public class Book {
    private String name;
    private String description;

    public Book() {
    }

    public Book(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tên của sách là: "+this.name+". mô tả về sách là: "+this.description;
    }
}
