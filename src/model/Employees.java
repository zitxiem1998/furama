package model;

public class Employees {
    private String name;
    private int age;
    private String position;

    public Employees() {
    }

    public Employees(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Tên của nhân viên là: " + this.name + ", Tuổi của nhân viên đó là: " + this.age + ", Chức vụ là: " + this.position;
    }
}
