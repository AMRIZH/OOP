package modul8.latihan;

public class TestPolyMorphism {
  public static void main(String[] args) {
    Anjing anj = new Anjing();
    anj.setName("Heli");
    anj.setSuara("Guk guk, pinjam dulu seratus");
    anj.setMakan("Tulang Hiu Megalodon");
    System.out.println(anj.panggilNama());
    System.out.println(anj.getSuara());
    anj.makanApa();
    System.out.println(anj.behaviour());

    System.out.println("-----------------------------------------");

    Kucing cat = new Kucing();
    cat.setName("Cat Wadon");
    cat.setSuara("meoong meong aing maunng");
    cat.setMakan("Ikan caviar palung mariana");
    System.out.println(cat.panggilNama());
    System.out.println(cat.getSuara());
    cat.makanApa();
    System.out.println(cat.behaviour());
  }
}
