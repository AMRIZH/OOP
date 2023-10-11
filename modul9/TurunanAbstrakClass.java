package modul9;

public class TurunanAbstrakClass extends AbstrakClass{
  int x;

  public TurunanAbstrakClass(int a, int b, int c){
    super(a, b, c);
    x = a+b+c;
  }

  public void printX(){
    System.out.println(x);
  }

  public static void main(String[] args) {
    TurunanAbstrakClass tac = new TurunanAbstrakClass(2, 3, 2);
    tac.printX();
    System.out.println(tac.kali());
  }
}
