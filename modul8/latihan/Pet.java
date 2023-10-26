package modul8.latihan;

public class Pet {
  private String name;
  private String suara;
  private String makanan;

  // seter getter nama
  public void setName(String beriNama){
    this.name = beriNama;
  }

  public String panggilNama(){
    return this.name;
  }

  // setter getter suara
  public void setSuara(String suara){
    this.suara = suara;
  }

  public String getSuara(){
    return this.suara;
  }

  // setter getter makanan
  public void setMakan(String makan){
    this.makanan = makan;
  }

  public void makanApa(){
    System.out.println("Aku suka makan "+ makanan);
  }
}
