package LabRab.Number4;

/**
 * Created by cisco on 29.10.18.
 */
public class Car implements Priceable {
    int price;

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
