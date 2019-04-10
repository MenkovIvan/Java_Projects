package PractRab.Number6_3;

import java.util.ArrayList;

    public class Test {
        protected ArrayList<Student> s = new ArrayList<Student>();
        protected ArrayList<Student> s2 = new ArrayList<Student>();


        public Test() {
        }
        public void Add_s(Student student){
            s.add(student);
        }
        public void Add_s2(Student student){
            s2.add(student);
        }

        public void Add_s(  int number,int age,String str){
            Student student = new Student(number,age,str);
            s.add(student);
        }
        public void Add_s2(  int number,int age,String str){
            Student student = new Student(number,age,str);
            s2.add(student);
        }

        public void SortRating_s(){
            int startIndex = 0;
            int endIndex = s.size() - 1;
            doSortRating_s(startIndex, endIndex);
        }

        public void SortRating_s2(){
            int startIndex = 0;
            int endIndex = s2.size() - 1;
            doSortRating_s2(startIndex, endIndex);
        }
        public void doSortRating_s(int start, int end) {
            if (start >= end)
                return;
            int i = start, j = end;
            int cur = i - (i - j) / 2;
            while (i < j) {
                while (i < cur && (s.get(i).getMark() <= s.get(cur).getMark())) {
                    i++;
                }
                while (j > cur && (s.get(cur).getMark() <= s.get(j).getMark())) {
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

        public void doSortRating_s2(int start, int end) {
            if (start >= end)
                return;
            int i = start, j = end;
            int cur = i - (i - j) / 2;
            while (i < j) {
                while (i < cur && (s2.get(i).getMark() <=s2.get(cur).getMark())) {
                    i++;
                }
                while (j > cur && (s2.get(cur).getMark() <= s2.get(j).getMark())) {
                    j--;
                }
                if (i < j) {
                    Student temp = s2.get(i);
                    s2.set(i,s2.get(j));
                    s2.set(j,temp);
                    if (i == cur)
                        cur = j;
                    else if (j == cur)
                        cur = i;
                }
            }
            doSortRating_s2(start, cur);
            doSortRating_s2(cur+1, end);
        }

        public void doSortRating_s3(ArrayList<Student> s3, int start, int end) {
            if (start >= end)
                return;
            int i = start, j = end;
            int cur = i - (i - j) / 2;
            while (i < j) {
                while (i < cur && (s3.get(i).getMark() <=s3.get(cur).getMark())) {
                    i++;
                }
                while (j > cur && (s3.get(cur).getMark() <= s3.get(j).getMark())) {
                    j--;
                }
                if (i < j) {
                    Student temp = s3.get(i);
                    s3.set(i,s3.get(j));
                    s3.set(j,temp);
                    if (i == cur)
                        cur = j;
                    else if (j == cur)
                        cur = i;
                }
            }
            doSortRating_s3(s3,start, cur);
            doSortRating_s3(s3,cur+1, end);
        }

        public void sout_s() {
            for (int i = 0; i < s.size(); i++) {
                System.out.println(s.get(i).getName() + " " + s.get(i).getMark());
            }
            System.out.println();
        }

        public void sout_s2() {
                for (int i = 0; i < s2.size(); i++) {
                    System.out.println(s2.get(i).getName() + " " + s2.get(i).getMark());
                }
                System.out.println();
        }

        public void addall(){
            ArrayList<Student> s3 = new ArrayList<Student>(s);
            s3.addAll(s2);
            doSortRating_s3(s3,0,s3.size()-1);
            for(int i = 0; i < s3.size(); i++)
            {
                System.out.println("Name - " + s3.get(i).getName() + "\nAge - " + s3.get(i).getAge() + "\nstuden number- " + s3.get(i).getMark()+"\n");
            }

        }
    }

