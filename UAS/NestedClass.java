package UAS;

public class NestedClass {
  String judul = "Rahasia Benua Hitam";
  String pengarang = "Anastasya Pastelina";
    
  public void infoBuku(){
      System.out.println(judul + " : " + pengarang);
  }

  //  INI STATIC NESTED CLASS UNTUK MENYIMPAN VARIABEL stokBuku
  public static class StokBuku{
      int stokBuku = 10;
      public void stokTerkini(){
          System.out.println("Stok terkini : "+ stokBuku);
      }
  }
    
  //  INI INNER CLASS UNTUK MENGAKSES VARIABEL stokBuku DI INNER CLASS LAIN
  class InnerClass{
      public void jumlahTerkini(int buku){
          System.out.println("Jumlah buku : " + buku);
      }
  }
    
  public static void main(String[] args) {
      NestedClass nc = new NestedClass();
      nc.infoBuku();
      NestedClass.StokBuku sb = new NestedClass.StokBuku();
      sb.stokTerkini();
      NestedClass.InnerClass ic = nc.new InnerClass();
      ic.jumlahTerkini(sb.stokBuku);
  }
}
