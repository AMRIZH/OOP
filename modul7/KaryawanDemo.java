package modul7;

public class KaryawanDemo {
  public static void main(String[] args) {
    Manager mgr1 = new Manager();
    mgr1.setgaji(10000);
    mgr1.setNama("asep");
    mgr1.setUsia(28);

    System.out.println("Nama : " + mgr1.getNama());
    System.out.println("Gaji : Rp."+mgr1.getgaji()+"/bulan");
    System.out.println("Usia : "+mgr1.getUsia()+" tahun");

    Manager mgr2 = new Manager();
    mgr2.setgaji(5000);
    mgr2.setNama("dwi");
    mgr2.setUsia(34);
    System.out.println("\nNama : " + mgr2.getNama());
    System.out.println("Gaji : Rp."+mgr2.getgaji()+"/bulan");
    System.out.println("Usia : "+mgr2.getUsia()+" tahun");

    Manager mgr3 = new Manager();
    mgr3.setgaji(6000);
    mgr3.setNama("febri");
    mgr3.setUsia(29);
    System.out.println("\nNama : " + mgr3.getNama());
    System.out.println("Gaji : Rp."+mgr3.getgaji()+"/bulan");
    System.out.println("Usia : "+mgr3.getUsia()+" tahun");

    Manager mgr4 = new Manager();
    mgr4.setgaji(7000);
    mgr4.setNama("hilman");
    mgr4.setUsia(27);
    System.out.println("\nNama : " + mgr4.getNama());
    System.out.println("Gaji : Rp."+mgr4.getgaji()+"/bulan");
    System.out.println("Usia : "+mgr4.getUsia()+" tahun");

    Manager mgr5 = new Manager();
    mgr5.setgaji(8000);
    mgr5.setNama("junaedi");
    mgr5.setUsia(26);
    System.out.println("\nNama : " + mgr5.getNama());
    System.out.println("Gaji : Rp."+mgr5.getgaji()+"/bulan");
    System.out.println("Usia : "+mgr5.getUsia()+" tahun");
  }
}
