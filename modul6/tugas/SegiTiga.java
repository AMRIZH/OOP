package modul6.tugas;

public class SegiTiga extends BangunDatar{
  double alas;
  double tinggi;

  // public SegiTiga(double alas, double tinggi){
  //   this.alas = alas;
  //   this.tinggi = tinggi;
  // }

  public void hitungKeliling(){
    this.keliling = this.alas*3;
  }
  
  public void hitungLuas(){
    this.luas = (this.alas*this.tinggi)/2 ;
  }
}
