package UAS.UAS2022;

public class Animal {
  public String getSpecies(String jenis){
    return jenis;
  }
  public int getWeight(int berat){
    return berat;
  }
}

class Cat extends Animal{
  @Override
  public String getSpecies(String a){
    return "Kucing";
  }
  @Override 
  public int getWeight(int berat){
    return berat*2;
  }

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.getSpecies("Kucing");
    cat.getWeight(50);
  }
}