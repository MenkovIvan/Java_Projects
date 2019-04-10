package PractRab.Number3;

public class Rectangle extends Shape {

    private double Width;

    private double Length;

    @Override
    public double getArea() {
        return Width*Length;
    }

    @Override
    public double getPerimetr() {
        return 2*(Width+Length);
    }

    @Override
    public String toString() {
        return "Area = "+getArea()+"\nPerimetr = "+getPerimetr();
    }

    public double getLength() {
        return Length;
    }

    public double getWidth() {
        return Width;
    }

    public void setLength(double Length) {
        this.Length = Length;
    }

    public void setWidth(double Width) {
        this.Width = Width;
    }

    public void Rectangle(){
        System.out.println("Konstruktor Rectangle work");
    }

    public void Rectangle(double Width, double Length){
        this.Length = Length;
        this.Width = Width;
    }

    public void Rectangle(double Width, double Length, boolean Filled, String Color){
        this.Width = Width;
        this.Length = Length;
        this.Filled = Filled;
        this.Color = Color;
    }
}
