package modul11;

public class Outer {
  static class NestedDemo{
    public void myMethod(){
      System.out.println("ini adalah method static nested class");
    }
  }

  public static void main(String[] args) {
    Outer.NestedDemo nested = new Outer.NestedDemo();
    nested.myMethod();
  }
}
