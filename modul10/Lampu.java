package modul10;

public class Lampu implements ActivityLampu{
  public int statusLampu;

  @Override
  public void matikanLampu(){
    if(statusLampu==-1){
      System.out.println("lampu sudah mati daritadi");
      }else if(statusLampu==1){
        statusLampu= -1;
        System.out.println("Lampu sudah dimatikan");
      }else if(statusLampu == 0){
        statusLampu =-1;
        System.out.println("Lampu sudah dimatikan");
      }
  }
  @Override
  public void nyalakanLampu() {
    if (statusLampu == 1){
      System.out.println("lampu menyala daritadi");
      } else if(statusLampu == -1) {
        statusLampu = +1;
        System.out.println("Lampu sudah dinyalakan");
      }else if(statusLampu == 0){
        statusLampu = +1;
        System.out.println("Lampu sudah dinyalakan");
      }
  }
  @Override
  public void lampuRedup(){
    if (statusLampu == 0){
      System.out.println("Lampu sudah redup daritadi");
    } else if (statusLampu==1) {
      statusLampu = 0;
      System.out.println("Lampu diredupkan");
    } else if(statusLampu==-1){
      statusLampu = 0;
      System.out.println("Lampu diredupkan");
    }
  }

    public int setSaklar(int saklar){
      return statusLampu = saklar;
    }
}
