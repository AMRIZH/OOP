package modul9.tugas;

public class Balok extends BangungRuang{
  private double sisi;
  private double tinggi;
  private double lebar;
  
  public Balok(double sisi, double tinggi, double lebar){
    this.sisi = sisi;
    this.tinggi = tinggi;
    this.lebar = lebar;
  }

  @Override
  public double luas() {
    return 2 * (this.sisi * this.tinggi + this.sisi * this.lebar + this.tinggi * this.lebar);
  }

  @Override
  public double volume() {
    return this.sisi * this.tinggi * this.lebar;
  }
}
