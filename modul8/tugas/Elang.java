package modul8.tugas;

import modul8.Hewan;

public class Elang extends Hewan{
  public void jalan(){
    System.out.println("Elang terbang");
  }

  public static void main(String[] args) {
    Elang elang = new Elang();
    elang.jalan();
  }
}
