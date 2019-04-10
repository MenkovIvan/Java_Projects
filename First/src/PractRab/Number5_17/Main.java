package PractRab.Number5_17;
import java.util.Scanner;
import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        System.out.println(recursion());
    }
        public static int recursion () {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (n == 0) {
                return 0;
            }
            else {
                return max(n, recursion());
            }
        }

}
