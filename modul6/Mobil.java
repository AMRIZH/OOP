package modul6;

public class Mobil extends Kendaraan{
  String bahanBakar = "bensin";
  int jumlahRoda = 4;

  void info(){
    System.out.println("bahan bakar : "+ this.bahanBakar);
    System.out.println("jumlah roda : "+this.jumlahRoda);
    System.out.println("Tahun pembuatan : " + this.tahunPembuatan);
    System.out.println("jenis kendaraan : " + this.jenis);
  }
}
