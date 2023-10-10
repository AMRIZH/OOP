package modul6;

public class Teknisi extends Pegawai{
  public static void main(String[] args) {
    double lemburPerJam = 40000;
    double gajiPerBulan;

    Pegawai enginer = new Pegawai();
    gajiPerBulan = enginer.gajiPokok + lemburPerJam;
    System.out.println("gaji bulanan : " + gajiPerBulan);
  }
}
