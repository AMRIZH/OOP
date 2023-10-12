package modul5;

public class Buku {
  String namaPengarang;
  String judulBuku;
  int tahunTerbit;
  int cetakanKe;
  double hargaJual;

  //default constructor
  public Buku(){
    System.out.println("Ini adalah buku");
  }

  //parameter construktor 
  public Buku(String namaPengarang){
    this.namaPengarang = namaPengarang;
    System.out.println("Ini adalah buku yang dibuat oleh " + namaPengarang);
  }

  public Buku(String judulBuku,int tahunTerbit,double hargaJual){
    this.judulBuku = judulBuku;
    this.tahunTerbit = tahunTerbit;
    this.hargaJual = hargaJual;
    System.out.println("buku berjudul " + judulBuku + " terbit pada tahun " + tahunTerbit + " dijual Seharga " + hargaJual);
  }

  public Buku(String namaPengarang, String judulBuku, int cetakanKe){
    this.namaPengarang=namaPengarang;
    this.judulBuku=judulBuku;
    this.cetakanKe = cetakanKe;
    System.out.println("Buku yang dikarang oleh " + namaPengarang + " yang berjudul " + judulBuku + " dicetak sebanyak " + cetakanKe + " kali");
  }

  //main program
  public static void main(String[] args) {
    Buku b1 = new Buku();
    Buku b2 = new Buku("mahmud");
    Buku b3 = new Buku("Semangat Luar biasa", 2022, 200000);
    Buku b4 = new Buku("Ahmad", "Gelora Api", 4);
    Buku b5 = new Buku("Rahasia Kucing", 2010, 50000);
    Buku b6 = new Buku("Ratu Nyi loro kidul", "Aku g suka warna ijo", 6);
    Buku b7 = new Buku("Bukan manusia");
    Buku b8 = new Buku("ini buku mahal", 1999, 999999);
    Buku b9 = new Buku("Semangat membara", 1944, 50000);
    Buku b10 = new Buku("Dora", "menguak sekte sesat bubur diaduk", 22);
  }
}
