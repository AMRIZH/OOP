package modul10;

public class Mamalia implements ActivityAnimal{
  public void eat(){
    System.out.println("Mamalia makan");
  }

  public void travel(){
    System.out.println("Mamalia berjalan");
  }

  public int noOfLeg(){
    return 0;
  }

  public static void main(String[] args) {
    Mamalia m = new Mamalia();
    m.eat();
    m.travel();
  }
}
