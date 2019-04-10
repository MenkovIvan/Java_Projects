package LabRab.Number4;

/**
 * Created by cisco on 29.10.18.
 */
public class Main {
    public static void main(String[] args) {
        Car cr = new Car();
        Computer cmp = new Computer();
        Flat flt = new Flat();
        cr.setPrice(123);
        cmp.setPrice(456);
        flt.setPrice(678);
        System.out.println(cr.getPrice());
        System.out.println(cmp.getPrice());
        System.out.println(flt.getPrice());
    }
}
