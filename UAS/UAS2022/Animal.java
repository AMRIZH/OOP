package UAS.UAS2022;

public class Animal {
  public String getSpecies(String jenis){
    return jenis;
  }
  public int getWeight(int berat){
    return berat;
  }
<<<<<<< HEAD
=======

  public static void main(String[] args) {

  }
>>>>>>> 587ffd38ad6ea12244d5c78e7ae369a3659ae3c5
}

class Cat extends Animal{
  @Override
  public String getSpecies(String a){
    return "Kucing";
  }
<<<<<<< HEAD
  @Override 
  public int getWeight(int berat){
    return berat*2;
  }

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.getSpecies("Kucing");
    cat.getWeight(50);
  }
=======
  @Override
  public int getWeight(int berat){
    return berat*2;
  }
>>>>>>> 587ffd38ad6ea12244d5c78e7ae369a3659ae3c5
}