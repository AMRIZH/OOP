package modul8.tugas;

public class Bank {
  public int bunga = 20;

  public int rasioBunga(){
    return this.bunga;
  }
  
  public void info(){
    System.out.println("Nilai bunga : " + this.bunga); 
  }
}
