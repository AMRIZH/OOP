package modul5;

public class ParamCons {
  String nama, nim;
  int semester;
  public ParamCons(String nama, int semester, String nim){
    this.nama = nama;
    this.nim = nim;
    this.semester = semester;
  }

  public void info() {
    System.out.println("Nama : " + nama + "\nNIM : " + nim + "\nSemester : " + semester);
  }
}
