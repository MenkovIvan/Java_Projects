package PractRab.Number6_2;

public class Student {
    private String name;
    private int mark;
    private int age;
    public Student(int mark, int age, String name){
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public String getName() {
        return name;
    }
    public int getMark() {
        return mark;
    }
    public int getAge() {
        return age;
    }
}
