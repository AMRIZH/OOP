package modul6.tugas;

import java.lang.Math;

public class SegiTigaSamaKaki extends SegiTiga{
  double sisiMiring;

  public SegiTigaSamaKaki(double alas, double tinggi){
    this.alas = alas;
    this.tinggi = tinggi;
    this.sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
  }

  public void hitungKeliling(){
    this.keliling = this.alas+(this.sisiMiring*2);
  }

  // public void hitungLuas(){
  //   this.luas = (this.alas * this.tinggi)/2;
  // }
}
