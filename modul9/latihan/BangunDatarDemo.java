package modul9.latihan;

public class BangunDatarDemo {
  public static void main(String[] args) {
    // Membuat objek dari kelas BangunDatar
    System.out.println("Persegi Panjang");
    PersegiPanjang pp = new PersegiPanjang(20, 30);
    System.out.println("Luas Persegi Panjang = " + pp.getLuas() +" cm2");
    System.out.println("Keliling Persegi Panjang = " + pp.getKeliling() +" cm");

    System.out.println("\nLingkaran");
    Lingkaran ling = new Lingkaran(21);
    System.out.println("Luas Lingkaran = " + ling.getLuas() +" cm2");
    System.out.println("Keliling Lingkaran = " + ling.getKeliling() +" cm");

    System.out.println("\nSegitiga");
    Segitiga segi3 = new Segitiga(10, 20);
    System.out.println("Luas Segitiga = " + segi3.getLuas() +" cm2");
    System.out.println("Keliling Segitiga = " + segi3.getKeliling() +" cm");

    System.out.println("\nJajar genjang");
    JajarGenjang jg = new JajarGenjang(20, 5, 14);
    System.out.println("Luas Jajar Genjang = " + jg.getLuas() +" cm2");
    System.out.println("Keliling Jajar Genjang = " +jg.getKeliling() +" cm");
  }
}
