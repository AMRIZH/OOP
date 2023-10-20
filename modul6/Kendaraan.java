package modul6;

public class Kendaraan {
  String warna = "merah";
  int tahunPembuatan = 2022;
  int jumlahRoda = 2 ;
  String jenis = "darat";

  void info(){
    System.out.println("Tahun Pembuatan : "+tahunPembuatan);
    System.out.println("Jumlah Roda : "+jumlahRoda);
    System.out.println("Jenis : "+jenis);
    System.out.println("Warna : "+warna);
  }
}
