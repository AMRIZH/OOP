package modul6;

public class Programmer extends Pegawai{
  public static void main(String[] args) {
    double lemburPerJam = 5000;
    double gajiPerBulan;

    Pegawai empolyi = new Pegawai();
    gajiPerBulan = empolyi.gajiPokok + lemburPerJam;
    System.out.println("gaji bulanan : " + gajiPerBulan);
  }
}
