package modul8;

public class DemoOverriding {
  public static void main(String[] args) {
    ParentClazz pc = new ParentClazz();
    ChildClazz cc = new ChildClazz();
    pc.printOut();
    cc.printOut();
  }
}
