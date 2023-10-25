package modul8.tugas;

public class BankDemo {
  public static void main(String[] args) {
    Bank bang = new Bank();
    bang.info();

    BankPribadi bp = new BankPribadi();
    bp.info();

    BankUmum bu = new BankUmum();
    bu.info();

    BankPasar bps = new BankPasar();
    bps.info();

    BankSyariah bs = new BankSyariah();
    bs.info();
  }
}
