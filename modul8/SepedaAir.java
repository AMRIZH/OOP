package modul8;

public class SepedaAir extends Sepeda{
  void run() {
    System.out.println("Sepeda hanya berjalan diatas air");
  }

  public static void main(String[] args) {
    Sepeda s = new SepedaAir(); //upcasting
    s.run();
  }
}
