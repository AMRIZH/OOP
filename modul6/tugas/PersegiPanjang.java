package modul6.tugas;

public class PersegiPanjang extends BangunDatar{
  int panjang;
  double lebar;

  public PersegiPanjang(int panjang, double lebar){
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public void hitungLuas(){
    this.luas = this.panjang * this.lebar;
  }

  public void hitungKeliling(){
    this.keliling = (this.panjang + this.lebar) * 2;
  }
}
