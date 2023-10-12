package modul11;

public class OuterDemo2 {
  private int num = 1276;
  public class Inner_Demo{
    public int getNum(){
      System.out.println("ini adalah nilai dari variable private method");
      return num;
    }
  }

  public static void main(String[] args) {
    // membuat object OuterDemo2
    OuterDemo2 outer = new OuterDemo2();

    //membuat object InnerDemo
    OuterDemo2.Inner_Demo inner = outer.new Inner_Demo();
    System.out.println(inner.getNum());
  }
}
