package PractRab.Number3;

public class Square extends Rectangle {

    private double Side;

    public double getSide() {
        return Side;
    }

    public void setSide(double Side) {
        this.Side = Side;
    }

    @Override
    public double getArea() {
        return Side*Side;
    }

    @Override
    public double getPerimetr() {
        return Side*4;
    }

    @Override
    public String toString() {
        return "Area = "+getArea()+"\nPerimetr = "+getPerimetr();
    }

    public void Square(){
        System.out.println("Konstruktor Square work");
    }

    public void Square(double Side){
        this.Side = Side;
    }

    public void Square(double Side, String Color, boolean Filled){
        this.Side = Side;
        this.Filled = Filled;
        this.Color = Color;
    }
}
