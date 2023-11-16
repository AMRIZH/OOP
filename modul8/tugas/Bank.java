package modul8.tugas;

public class Bank {
  protected int bunga = 20;

  public int rasioBunga(){
    return bunga;
  }
  
  public void info(){
    System.out.println("Nilai bunga bank : " + bunga+"%"); 
  }
}
