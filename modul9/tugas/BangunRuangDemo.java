package modul9.tugas;

public class BangunRuangDemo {
  public static void main(String[] args) {
    System.out.println("Bangun Ruang Balok");
    Balok blk = new Balok(40, 50, 60);
    System.out.println("Luas Balok = " + blk.getLuas());
    System.out.println("Volume Balok = " + blk.getVolume());

    System.out.println("\nBangun Ruang Kubus");
    Kubus kbs = new Kubus(50);
    System.out.println("Luas Kubus = " + kbs.getLuas());
    System.out.println("Volume Kubus = " + kbs.getVolume());

    System.out.println("\nBangun Ruang Bola");
    Bola bol = new Bola(21);
    System.out.println("Luas Bola = " + bol.getLuas());
    System.out.println("Volume Bola = " + bol.getVolume());

    System.out.println("\nBangun Ruang Kerucut");
    Kerucut krct = new Kerucut(50, 28);
    System.out.println("Luas Kerucut = " + krct.getLuas());
    System.out.println("Volume Kerucut = " + krct.getVolume());
    
    System.out.println("\nBangun Ruang Prisma");
    PrismaSegiTiga pst = new PrismaSegiTiga(50, 14, 13);
    System.out.println("Luas Prisma Segi Tiga = " +pst.getLuas());
    System.out.println("Volume Prisma Segi Tiga = " +pst.getVolume());
  }
}
