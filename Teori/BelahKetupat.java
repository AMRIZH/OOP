public class BelahKetupat {
  int lebar;
  int tinggi;
  int sisi;

  public BelahKetupat(int lebar, int tinggi, int sisi){
    this.lebar = lebar;
    this.tinggi= tinggi;
    this.sisi  = sisi ;
    System.out.println("Bangun datar Belah Ketupat memiliki  \nLebar : " + this.lebar + "\nTinggi : " + this.tinggi + "\nPanjang Sisi : " + this.sisi + "\n---------------------------");
  }

  void hitungLuas(){
    System.out.println("Luas Belah Ketupat adalah " + (this.lebar*this.tinggi)/2 + " cm2");
  }

  void hitungKeliling(){
    System.out.println("keliling Belah Ketupat adalah " + this.sisi*4 + " cm");
  }

  public static void main(String[] args) {
    BelahKetupat bk = new BelahKetupat(15, 20, 25);
    bk.hitungLuas();
    bk.hitungKeliling();
  }
}
