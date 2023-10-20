package modul6;

public class Pesawat extends Kendaraan{
  String madeIn = "nigeria";
  String jenis = "Udara";

  void info(){
    System.out.println("Tahun Pembuatan : "+ this.tahunPembuatan);
    System.out.println("Jenis kendaraan : "+ this.jenis);
    System.out.println("Warna : "+ this.warna);
    System.out.println("Made in : "+ this.madeIn);
    
  }
}
