package modul7;

public class Manager extends Karyawan{
  private float jamKerja = 8.5f;

  public int jamKerja() {
    return (int) jamKerja;
  }

  public float getGajiManager() {
    return getGaji() *2;
  }

  public static void main(String[] args) {
    Manager mgr1 = new Manager();
    System.out.println("Jam kerja manager : " + mgr1.jamKerja());
    System.out.println("Gaji manager : Rp."+mgr1.getGajiManager());
  }
}
