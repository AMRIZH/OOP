package modul9;

public abstract class MethodAbstrak {
  public abstract int luas();
  public abstract int keliling();

  public int getLuas(){
    return luas();
  }

  public int getKeliling(){
    return keliling();
  }
}