package modul8.latihan;

public class TestPolyMorphism {
  public static void main(String[] args) {
    Anjing anj = new Anjing("bahlul", "sate megalodon");
    System.out.println(anj.panggilNama());
    System.out.println(anj.behaviour());
    anj.makanApa();
    System.out.println(anj.bersuara());

    Kucing cat = new Kucing("Mariposa", "Caviar");
    System.out.println(cat.panggilNama());
    System.out.println(cat.behaviour());
    cat.makanApa();
    System.out.println(cat.bersuara());
  }
}
