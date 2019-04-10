package PractRab.Number6_2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student a, Student b){
        if(a.getMark()> b.getMark())
            return 1;
        else if(a.getMark()< b.getMark())
            return -1;
        else
            return 0;
    }
}
