package PractRab.Number5_15;

import java.util.Scanner;

public class Main {
    public static int abc(int a){
        if ( (a%10 == 0) && (a/10 == 0) ){
           return 1;
        }
        System.out.println(a%10);
        return abc(a/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number = ");
        int a = sc.nextInt();
        abc(a);
    }
}
