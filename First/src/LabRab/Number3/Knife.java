package lab3;

import lab3.Dish;

/**
 * Created by cisco on 29.10.18.
 */
public class Knife extends Dish {
    public Knife(String Material,int Date) {
        System.out.println("Vgik-Brik");
        this.Material = Material;
        this.Date = Date;
    }
    @Override
    public void wash() {
        System.out.println("The knife is washed");
    }
}

