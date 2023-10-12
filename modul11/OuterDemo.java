package modul11;

public class OuterDemo {
  int num;

  //inner class
  private class InnerDemo{
    private void print(){
      System.out.println("Ini merupakan method inner class");
    }
  }

  void displayInner(){
    InnerDemo inner = new InnerDemo();
    inner.print();
  }

  public static void main(String[] args) {
    //membuat object Outer class
    OuterDemo outer = new OuterDemo();

    //mengakses method dari Outer class
    outer.displayInner();
  }
}
