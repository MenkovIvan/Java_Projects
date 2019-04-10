package LabRab.Number4;


public class Computer implements Priceable {
    int price;

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
