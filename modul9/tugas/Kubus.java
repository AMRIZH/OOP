package modul9.tugas;

public class Kubus extends BangungRuang{
  private double sisi;
  public Kubus(double sisi){
    this.sisi = sisi;
  }

  @Override
  public double luas() {
    return 6 * sisi * sisi;
  }

  @Override
  public double volume() {
    return sisi * sisi * sisi;
  }
}
