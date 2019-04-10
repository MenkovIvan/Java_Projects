package lab3;

import lab3.Dish;

/**
 * Created by cisco on 29.10.18.
 */
public class Spoon extends Dish {
    public Spoon(String Material,int Date) {
        System.out.println("Booms-Tudums");
        this.Material = Material;
        this.Date = Date;
    }
    @Override
    public void wash() {
        System.out.println("The spoon is washed");
    }
}

