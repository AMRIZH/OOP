package modul10;

public class Lampu implements ActivityLampu{
  public int statusLampu;

  @Override
  public void matikanLampu(){
    if(statusLampu==0){
      System.out.println("lampu sudah mati");
      }else if(statusLampu==1){
        statusLampu=-1;
        System.out.println("Lampu sudah dimatikan bng");
      }
    }
    @Override
    public void nyalakanLampu() {
      if (statusLampu == 1){
        System.out.println("lampu sudah dinyalakan");
        } else {
          statusLampu =+ 1;
          System.out.println("Lampu sudah dalam keadaan menyala");
        }
    }

    public int setSaklar(int saklar){
      return statusLampu = saklar;
    }
}
