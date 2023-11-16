package modul8.tugas;

public class BankPasar extends BankUmum{
  protected int bunga = 45;

  public BankPasar(){
    super();
    System.out.println("Bunga Bank Pasar = "+this.bunga);
  }
}
