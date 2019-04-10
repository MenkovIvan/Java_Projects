package PractRab.Number6_4;

import java.util.Scanner;

public class Bouble {
    public  Bouble(){
        int[] array = new int[5];
        Scanner cs = new Scanner(System.in);
        for (int i = 0; i<5; i++)
        {
            array[i]=cs.nextInt();
        }
        for (int i = 5 - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (array[j] > array[j + 1])
                {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
        for (int i = 0; i<5; i++)
        {
            System.out.println(array[i]);
        }

    }

}
