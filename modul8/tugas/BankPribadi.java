package modul8.tugas;

public class BankPribadi extends Bank{
  private int bunga = 30;

  public BankPribadi(){
    super();
    System.out.println("Bunga Bank Pribadi = "+this.bunga);
  }
}
