package PractRab.Number6_1;

import java.util.ArrayList;

public class Test { protected ArrayList<Student> s = new ArrayList<Student>();

    public Test() {
    }
    public void Add(Student student){
        s.add(student);
    }

    public void Add(  int number,int age,String str){
        Student student = new Student(number,age,str);
        s.add(student);
    }

    public void SortRating(){
        int startIndex = 0;
        int endIndex = s.size() - 1;
        doSortRating_s(startIndex, endIndex);
    }
    public void doSortRating_s(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (s.get(i).getiDNumber() <= s.get(cur).getiDNumber())) {
                i++;
            }
            while (j > cur && (s.get(cur).getiDNumber() <= s.get(j).getiDNumber())) {
                j--;
            }
            if (i < j) {
                Student temp = s.get(i);
                s.set(i,s.get(j));
                s.set(j,temp);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSortRating_s(start, cur);
        doSortRating_s(cur+1, end);
    }




    public void sout() {
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i).getName() + " " + s.get(i).getiDNumber());
        }
        System.out.println();
    }
}
