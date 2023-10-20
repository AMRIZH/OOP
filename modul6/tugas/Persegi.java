package modul6.tugas;

public class Persegi extends BangunDatar{
  double sisi;

  public Persegi(int sisi){
    this.sisi = sisi;
  }

  public double hitungLuas(){
    return this.luas =  (sisi * sisi);
  }

  public double hitungKeliling(){
    return this.keliling = sisi*4;
  }

  // public static void main(String[] args) {
  //   Persegi p = new Persegi(24);
  //   p.hitungLuas();
  //   p.hitungKeliling();
  // }
}
