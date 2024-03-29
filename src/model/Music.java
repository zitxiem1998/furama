package model;

public class Music {
    private String name;
    private String author;

    public Music() {
    }

    public Music(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Tên của nhạc là: "+this.name+", tác giả là: "+this.author;
    }
}
