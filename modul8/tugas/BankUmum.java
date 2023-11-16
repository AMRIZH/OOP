package modul8.tugas;

public class BankUmum extends Bank{
  protected int bunga = 35;

  public BankUmum(){
    System.out.println("Bunga Bank Umum = "+this.bunga+"%");
  }
}
