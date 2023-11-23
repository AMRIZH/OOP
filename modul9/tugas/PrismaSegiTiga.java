package modul9.tugas;

public class PrismaSegiTiga extends BangungRuang{
  private double tinggi;
  private double tinggiAlas;
  private double panjangAlas;

  public PrismaSegiTiga(double tinggi, double tinggiAlas, double panjangAlas){
    this.tinggi = tinggi;
    this.tinggiAlas = tinggiAlas;
    this.panjangAlas = panjangAlas;
  }
  @Override
  public double luas() {
    return (panjangAlas* tinggi)*3 + (tinggiAlas * panjangAlas);
  }

  @Override
  public double volume() {
    return tinggi * tinggiAlas * panjangAlas /2;
  }
}
