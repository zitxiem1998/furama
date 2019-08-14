package model;

public class Video {
    private String name;
    private String content;

    public Video() {
    }

    public Video(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public String toString() {
        return "Tên của video là: "+this.name+", nội dung chính của video là: "+this.content;
    }
}
