package modul11.latihan;

public class OuterClass {
  public String name = "cobanested";
  public static int count;

  public class InnerClass{
    int code = 1;
    public void printCode(){
      System.out.println("Innerclass code : " + code);
    }
  }

  public static class StaticNestedClass{
    int count = 2;
    public void printCount(){
      System.out.println("StaticNestedClass count : " + count);
    }
  }

  public static void main(String[] args) {
    OuterClass outerObj = new OuterClass();
    OuterClass.InnerClass innerObj = outerObj.new InnerClass();
    innerObj.printCode();
    OuterClass.StaticNestedClass nestedObj = new StaticNestedClass();
    nestedObj.printCount();

  }
}

// ----------------------------------------------------------------
// Innerclass code : 1
// StaticNestedClass count : 2
