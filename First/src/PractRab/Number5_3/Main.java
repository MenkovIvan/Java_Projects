package PractRab.Number5_3;

import java.util.Scanner;

public class Main {
    public static int abc(int a, int b){
        System.out.println(a);
        if (b == a){
            return 1;
        }
        return abc(a+1,b);
    }
    public static int def(int b, int a){
        System.out.println(b);
        if (a == b){
            return 1;
        }
        return def(b-1,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a = ");
        int a = sc.nextInt();
        System.out.println("Write b = ");
        int b = sc.nextInt();
        if ( a < b ){
            abc(a,b);
        }else if ( a > b ){
            def(a,b);
        }
    }
}
