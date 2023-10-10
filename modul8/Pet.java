package modul8;

public class Pet {
  private String name;

  public void setName(String beriNama){
    this.name = beriNama;
  }

  public String panggilNama(){
    return this.name;
  }

  public String behaviour(){
    return "Hewan mencakar";
  }
}
