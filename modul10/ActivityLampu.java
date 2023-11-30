package modul10;

public interface ActivityLampu {
  public static final int LAMPU_HIDUP=1;
  public static final int LAMPU_MATI=-1;
  public abstract void matikanLampu();
  public abstract void nyalakanLampu();
  public abstract void lampuRedup();
}
