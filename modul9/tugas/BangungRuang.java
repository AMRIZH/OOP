package modul9.tugas;

public abstract class BangungRuang {
  public abstract double luas();
  public abstract double volume();

  public double getLuas(){
    return luas();
  }

  public double getVolume(){
    return volume();
  }
}
