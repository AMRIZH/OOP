package modul9.latihan;
import modul9.MethodAbstrak;

public class Lingkaran extends MethodAbstrak{
  private double jariJari;

  public Lingkaran(double jariJari){
    this.jariJari = jariJari;
  }
  
  @Override
  public int luas() {
    return (int) ((int)Math.PI * Math.pow(jariJari,2));
  }

  @Override
  public int keliling() {
    return (int)(2*Math.PI*jariJari);
  }
  
}
