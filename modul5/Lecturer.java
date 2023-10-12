package modul5;

public class Lecturer {
  String name;
  String address;
  String mataKuliah;
  int NIDN;
  int jumlahMhs;

  public Lecturer(){
    System.out.println("Dosen adalah orang yang berjasa dalam mencerdaskan anak negeri");
  }

  public Lecturer(String name, String address, String mataKuliah, int NIDN, int jumlahMhs){
    this.name = name;
    this.NIDN = NIDN;
    this.address=address;
    this.mataKuliah=mataKuliah;
    this.jumlahMhs=jumlahMhs;
  }

  void infoDosen(){
    System.out.println("Profil Dosen :\nNama : " + this.name + "\nNIDN : " + this.NIDN + "\naddress : " + this.address + "\nMatkul yang diajar : " + this.mataKuliah + "\nJumlah Mahasiswa : " + this.jumlahMhs);
  }

  public static void main(String[] args) {
    Lecturer dosen = new Lecturer();
    Lecturer Wahyu = new Lecturer("Wahyu", "Solo", "Teknik Pernafasan", 12345,500);
    Wahyu.infoDosen();
  }
}
