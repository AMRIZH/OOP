package modul8.tugas;

public class BankSyariah extends BankUmum{
  protected int bunga = 0;

  public BankSyariah(){
    super();
    System.out.println("Bunga Bank Syariah = "+this.bunga);
  }
}
