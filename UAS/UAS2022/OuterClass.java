package UAS.UAS2022;

public class OuterClass {
  public static int count = 0;
  public String code = "code";

  public OuterClass() {
    count++;
    System.out.println("Object Created : " + count);
  }

  class InnerClass{
    public void code(String kode){
      code = kode;
      System.out.println("Code method from innerclass accesss outerClass variables : " + code);
    }
  }

  static class StaticNestedClass{
    public void add(int a){
      OuterClass.count = count+a;
      System.out.println("Static counter added " + OuterClass.count);
    }
  }

  public static void main(String[] args) {
    OuterClass OuterObj = new OuterClass();
    InnerClass InnerObj = OuterObj.new InnerClass();
    StaticNestedClass StaticObj = new OuterClass.StaticNestedClass();

    InnerObj.code("Amri Zadi");
    StaticObj.add(5);
  }
}
