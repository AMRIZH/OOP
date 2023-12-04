package nestedclass;

public class Customer {
  int ID;
  String nama;
  String alamat;
  int ongkir;

  void setID(int ID){
    this.ID = ID;
  }
  int getID(){
    return this.ID;
  }

  void setNama(String nama){
    this.nama = nama;
  }
  String getNama(){
  return this.nama;
  }

  void setAlamat(String alamat){
    this.alamat = alamat;
  }
  String getAlamat(){
    return this.alamat;
  }
  
  void setOngkosKirim(int ongkir){
    this.ongkir = ongkir;
  }
  int getOngkosKirim(){
    return this.ongkir;
  }
}
