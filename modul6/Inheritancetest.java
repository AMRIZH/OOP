package modul6;

public class Inheritancetest {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();

    a.MessagesA();
    b.MessagesA();
    b.MessagesB();
    c.MessagesA();
    c.MessagesB();
    c.MessagesC();
  }
}
