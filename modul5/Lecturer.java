package modul5;

public class Lecturer {
  //global variable
  String name;
  String address;
  String mataKuliah;
  int NIDN;
  int jumlahMhs;

  //default parameter
  public Lecturer(){
    System.out.println("Dosen adalah orang yang berjasa dalam mencerdaskan anak negeri");
  }

  //parameter cons
  public Lecturer(String name, String address, String mataKuliah, int NIDN, int jumlahMhs){
    this.name = name;
    this.NIDN = NIDN;
    this.address=address;
    this.mataKuliah=mataKuliah;
    this.jumlahMhs=jumlahMhs;
  }

  //simple additional method
  void infoDosen(){
    System.out.println("Profil Dosen :\nNama : " + this.name + "\nNIDN : " + this.NIDN + "\naddress : " + this.address + "\nMatkul yang diajar : " + this.mataKuliah + "\nJumlah Mahasiswa : " + this.jumlahMhs);
  }

  //main program
  public static void main(String[] args) {
    Lecturer dosen = new Lecturer();
    Lecturer Wahyu = new Lecturer("Wahyu", "Solo", "Teknik Pernafasan", 12345,500);
    Wahyu.infoDosen();
  }
}
