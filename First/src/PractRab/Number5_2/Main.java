package PractRab.Number5_2;

import java.util.Scanner;

public class Main {

    public static int abc(int a, int n)
    {
        System.out.println(a);
        if (a == n){
            return 1;
        }
        return abc(a+1,n);
    }
    public static void main(String[] args) {
        int a = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number");
        int n = sc.nextInt();
        abc(a,n);
    }
}
