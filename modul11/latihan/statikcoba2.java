package modul11.latihan;

public class statikcoba2 {
  String nama = "Amri";
  String nim = "L200224288";

  public void printNama(){
    System.out.println(nama + " : " + nim);
  }

  static class StaticNestedClass{
    String jurusan = "Informatika";
  }

  class InnerClass{
    StaticNestedClass jenng = new StaticNestedClass();
    public void jurusan(){
      System.out.println("Jurusan saya adalah "+ jenng.jurusan);
    }
  }
}