package lab3;

import lab3.Fork;
import lab3.Knife;
import lab3.Spoon;

/**
 * Created by cisco on 29.10.18.
 */
public class Main {
    public static void main(String[] args) {
       Fork frk = new Fork("Plastic",2018);
       frk.wash();
       Knife knf = new Knife("Metal",2016);
       knf.wash();
       Spoon spn = new Spoon("Gold", 1998);
       spn.wash();
    }
}
