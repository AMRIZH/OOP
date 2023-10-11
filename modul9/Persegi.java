package modul9;

public class Persegi extends MethodAbstrak{
  int sisi =5;

  public int luas(){
    return sisi*sisi;
  }

  public int keliling(){
    return sisi*4;
  }

  //method main
  public static void main(String[] args) {
    Persegi psg = new Persegi();
    System.out.println("Luas persegi dengan sisi " +psg.sisi+ " adalah " + psg.getLuas());
    System.out.println("keliling persegi adalah "+ psg.getKeliling());
  }
}
