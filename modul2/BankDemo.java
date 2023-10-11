public class BankDemo {
  public static void main(String[] args) {
    Bank masBro = new Bank();
    masBro.Rekening(230000, 2345, "masBro");
    masBro.cekNoRek();
    masBro.cekSaldo();
    masBro.menabung(10000);
    masBro.cekSaldo();
    masBro.menarik(50000);
    masBro.cekSaldo();
    masBro.transfer(400000);
    masBro.cekSaldo();
  }
}
