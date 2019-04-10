package PractRab.Number3;
import java.lang.Math;

public class Circle extends Shape{

    private double Radius;

    @Override
    public double getArea() {
        return Math.PI*Radius*Radius;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*Radius;
    }

    @Override
    public String toString() {
        return "Area = "+getArea()+"\nPerimetr = "+getPerimetr();
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
    }

     public void Circle(){
        System.out.println("Konstruktor Circle work");
     }

     public void Circle(double Radius){
        this.Radius = Radius;
     }

     public void Circle(double Radius, String Color, boolean Filled){
        this.Radius = Radius;
        this.Color = Color;
        this.Filled = Filled;
     }
}

