package modul11.latihan;

public class StaticNestedClass{
  public static void main(String[] args) {
    NestedClass OuterObjek = new NestedClass();
    OuterObjek.printNama();
    NestedClass.InnerClass InnerObject = OuterObjek.new InnerClass();
    InnerObject.jurusan();
  }
}
