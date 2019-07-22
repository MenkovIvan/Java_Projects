package model;

public class User {

    private String name;
    private int age;
    private String password;

    public User() {
        this.name = null;
        this.age = 0;
        this.password = null;
    }

    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
}
