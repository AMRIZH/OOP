package modul8.tugas;

public class BankSyariah extends BankUmum{
  protected int bunga = 0;

  public BankSyariah(){
    System.out.println("Bunga Bank Syariah = "+this.bunga+"%");
  }
}
