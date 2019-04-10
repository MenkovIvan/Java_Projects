package PractRab.Number6_4;

import java.util.Scanner;

public class Inputs {
    public  Inputs() {
        int[] array = new int[5];
        Scanner cs = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            array[i] = cs.nextInt();
        }
        int j;
        for (int i=0; i < 5; i++) {  // цикл проходов, i - номер прохода
            int x = array[i];

            // поиск места элемента в готовой последовательности
            for (j=i-1; j>=0 && array[j] > x; j--)
                array[j+1] = array[j];  	// сдвигаем элемент направо, пока не дошли

            // место найдено, вставить элемент
            array[j+1] = x;
        }

        for (int i = 0; i<5; i++)
        {
            System.out.println(array[i]);
        }
    }
}
