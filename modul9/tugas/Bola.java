package modul9.tugas;

public class Bola extends BangungRuang{
  private double radius;

  public Bola(double radius) {
    this.radius = radius;
  }

  @Override
  public double luas() {
    return (int)(4 * Math.PI * radius);
  }

  @Override
  public double volume() {
    return (int)(4/3 * Math.PI * Math.pow(radius,3));
  }
}
