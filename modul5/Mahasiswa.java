package modul5;

public class Mahasiswa {
  String name = "Salah";
  int NIM = 2002000;
  String address = "Jepang";

  //default constructor
  public Mahasiswa(){
    System.out.println("Aku mahasiswa bernama "+ name + " dengan NIM " + NIM + " tinggal di " + address);
  }

  //main
  public static void main(String[] args) {
    Mahasiswa Salah = new Mahasiswa();
  }
}
