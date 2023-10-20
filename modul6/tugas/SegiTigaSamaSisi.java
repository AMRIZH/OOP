package modul6.tugas;

import java.lang.Math;

public class SegiTigaSamaSisi extends SegiTiga{
  double sisi;

  public SegiTigaSamaSisi(double sisi) {
    this.sisi = sisi;
    this.alas = this.sisi;
  }

  // public void hitungKeliling(){
  //   this.luas =  sisi*3;
  // }

  public void hitungLuas(){
    this.luas = (Math.sqrt(3)*sisi*sisi)/4;
  }
}
