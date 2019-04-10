package PractRab.Number6_2;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students?");
        int n = sc.nextInt();
        for ( int i = 0; i < n; i++ ) {
            int age, mark;
            String name;
            System.out.print("Age, Mark, Name");
            age = sc.nextInt();
            mark = sc.nextInt();
            name = sc.nextLine();
            Student a = new Student(age, mark, name);
            arr.add(a);
        }
        SortingStudentsByGPA s = new SortingStudentsByGPA();
        for(int i = 0; i < arr.size(); i++)
            if(i < arr.size() - 1)
                if(s.compare(arr.get(i),arr.get(i+1))==1)
                {
                    Student student = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, student);
                    i = -1;
                }
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.println("students number - " + (i + 1));
            System.out.println("Name - " + arr.get(i).getName() + "\nAge - " + arr.get(i).getAge() + "\nMark- " + arr.get(i).getMark());
        }
    }
}

