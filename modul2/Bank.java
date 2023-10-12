public class Bank {
  double saldo;
  int noRek;
  String name;

  public void Rekening(double saldo, int noRek,String name){
    this.saldo = saldo;
    this.noRek = noRek;
    this.name = name;
  }

  void cekNoRek(){
    System.out.println("No rekneing anda adalah : " + this.noRek);
  }

  void cekSaldo(){
    System.out.println("saldo anda berjumlah : " + this.saldo);
  }

  void menabung(double tabung){
    this.saldo = this.saldo + tabung;
    System.out.println("Anda telah menabung sejumlah " + tabung);
  }

  void menarik(double tarik){
    this.saldo = this.saldo - tarik;
    System.out.println("Anda menarik uang sejumlah " + tarik);
  }

  void transfer(double kirim){
    this.saldo = this.saldo - kirim;
    System.out.println("Transefer uang sejumlah " + kirim + " telah berhasil");
  }

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
