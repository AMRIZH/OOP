package modul11.latihan;

public class NestedClass {
  String nama = "Amri";
  String nim = "L200224288";

  public void printNama(){
    System.out.println(nama + " : " + nim);
  }

  static class StaticNestedClass{
    static String jurusan = "Informatika";
  }

  class InnerClass{
    public void jurusan(){
      System.out.println("Jurusan saya adalah "+ StaticNestedClass.jurusan);
    }
  }
}
