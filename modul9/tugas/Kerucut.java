package modul9.tugas;

public class Kerucut extends BangungRuang{
  private double tinggi;
  private double radius;
  public Kerucut(double tinggi, double radius){
    this.tinggi = tinggi;
    this.radius = radius;
  }

  @Override
  public double luas() {
    return (Math.PI* Math.pow((this.tinggi + this.radius), 2));
  }

  @Override
  public double volume() {
    return (Math.PI * Math.pow(this.tinggi, 2)) * this.radius;
  }
}
