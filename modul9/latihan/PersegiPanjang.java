package modul9.latihan;
import modul9.MethodAbstrak;

public class PersegiPanjang extends MethodAbstrak{
  private int panjang, lebar;

  public PersegiPanjang(int panjang,int lebar){
    this.panjang = panjang;
    this.lebar = lebar;
  }

  @Override
  public int luas() {
    return (this.panjang * this.lebar);
  }

  @Override
  public int keliling() {
    return (2*(this.panjang + this.lebar));
  }
  
}
