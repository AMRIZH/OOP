package modul7;

public class KaryawanDemo {
  public static void main(String[] args) {
    Karyawan k1 = new Karyawan();
    k1.setNama("mahmud");
    k1.setgaji(4000000);
    k1.setUsia(26);

    System.out.println(k1.getNama());
    System.out.println(k1.getGaji());
    System.out.println(k1.getUsia());
  }
}
