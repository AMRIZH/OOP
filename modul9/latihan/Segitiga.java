package modul9.latihan;
import java.security.PublicKey;

import modul9.MethodAbstrak;

public class Segitiga extends MethodAbstrak{
  private int alas;
  private int tinggi;
  
  public Segitiga(int alas, int tinggi){
    this.alas = alas;
    this.tinggi = tinggi;
  }

  public void setLuas(){
    double luas = (this.alas * this.tinggi) / 2; 
  }

  public void setKeliling(){
    double keliling = this.alas + this.tinggi + Math.sqrt((Math.pow(this.tinggi,
    2)) - ((Math.pow(this.alas, 2)))/4);
  }

  @Override
  public int luas() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'luas'");
  }

  @Override
  public int keliling() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'keliling'");
  }

}
