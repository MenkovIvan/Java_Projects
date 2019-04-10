package lab3;

import lab3.Dish;

/**
 * Created by cisco on 29.10.18.
 */
public class Fork extends Dish {
    public Fork(String Material,int Date) {
        System.out.println("Chik-Fshik");
        this.Material = Material;
        this.Date = Date;
    }

    @Override
    public void wash() {
        System.out.println("The fork is washed");
    }
}
