package modul9.latihan;
import modul9.MethodAbstrak;

public class JajarGenjang extends MethodAbstrak{
  private int alas, sisiMiring, tinggi;

  public JajarGenjang(int alas, int tinggi, int sisiMiring){
    this.alas = alas;
    this.tinggi = tinggi;
    this.sisiMiring = sisiMiring;
  }

  @Override
  public int luas() {
    return (this.alas * this.tinggi);
  }

  @Override
  public int keliling() {
    return ((2 * this.alas) + (2 * this.sisiMiring));
  }
}