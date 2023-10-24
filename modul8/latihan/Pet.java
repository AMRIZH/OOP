package modul8.latihan;

public class Pet {
  protected String name;
  protected String suara;
  protected String makanan;

  public void setName(String beriNama){
    this.name = beriNama;
  }

  public String panggilNama(){
    return this.name;
  }

  public String behaviour(){
    return "Hewan mencakar";
  }

  public String bersuara(){
    return this.suara;
  }

  public void makanApa(){
    System.out.println("Aku suka makan "+ makanan);
  }
}
