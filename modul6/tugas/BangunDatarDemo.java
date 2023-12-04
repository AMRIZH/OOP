package modul6.tugas;

public class BangunDatarDemo {
  public static void main(String[] args) {
    System.out.println("Persegi");
    Persegi kotak = new Persegi(50);
    kotak.hitungKeliling();
    kotak.hitungLuas();
    kotak.info();

    System.out.println("Persegi Panjang");
    PersegiPanjang pp = new PersegiPanjang(150, 80);
    pp.hitungLuas();
    pp.hitungKeliling();
    pp.info();

    System.out.println("SegiTiga SamaKaki");
    SegiTigaSamaKaki smk = new SegiTigaSamaKaki(30, 40,45);
    smk.hitungKeliling();
    smk.hitungLuas();
    smk.info();

    System.out.println("SegiTiga SamaSisi");
    SegiTigaSamaSisi sms = new SegiTigaSamaSisi(30);
    sms.hitungKeliling();
    sms.hitungLuas();
    sms.info();
  }
}
