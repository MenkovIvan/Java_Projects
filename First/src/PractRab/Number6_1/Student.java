package PractRab.Number6_1;

public class Student {
    private String name;
    private int iDNumber;
    private int age;
    public Student(int iDNumber, int age, String name){
        this.name = name;
        this.age = age;
        this.iDNumber = iDNumber;
    }

    public String getName() {
        return name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public int getAge() {
        return age;
    }
}
