package PractRab.Number3;

public abstract class Shape {

  protected String Color;

  protected boolean Filled;

  public abstract double getArea();

  public abstract double getPerimetr();

  public abstract String toString();

  public Shape(){
      System.out.println("Konstruktor Shape work");
  }

  public Shape(String Color, boolean Filled){
      this.Color = Color;
      this.Filled = Filled;
  }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public boolean isFilled() {
        return Filled;
    }

    public void setFilled(boolean Filled) {
        this.Filled = Filled;
    }
}
