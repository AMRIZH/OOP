package modul9.tugas;

public abstract class BangungRuang {
  private String namaBangunan;
  public BangungRuang(String nama) {
    this.namaBangunan = nama;
  }
  public void setNamaBangunan (String nama){
    this.namaBangunan=nama;
  }
  public String getNamaBangunan(){
    return this.namaBangunan;
  }
}
