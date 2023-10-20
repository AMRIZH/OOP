package modul6.tugas;

public class BangunDatar {
  double luas;
  double keliling;

  public double hitungLuas(double luas){
    return this.luas = luas;
  }

  public double hitungKeliling(double keliling){
    return this.keliling = keliling;
  }

  public void info(){
    System.out.println("Luas Bangun datar ini : " + this.luas);
    System.out.println("Keliling bangun datdar ini : " + this.keliling);
  }
}
