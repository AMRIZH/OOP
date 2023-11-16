package modul9.latihan;
import modul9.MethodAbstrak;

public class Segitiga extends MethodAbstrak{
  private int alas;
  private int tinggi;
  
  public Segitiga(int alas, int tinggi){
    this.alas = alas;
    this.tinggi = tinggi;
  }

  @Override
  public int luas() {
     return (this.alas * this.tinggi) / 2;
  }

  @Override
  public int keliling() {
    double keliling = this.alas + this.tinggi + Math.sqrt((Math.pow(this.tinggi,
    2)) - ((Math.pow(this.alas, 2)))/4);
    return (int) keliling;
  }

}
