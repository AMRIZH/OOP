package ExceptionHandling;

public class TryCatchFin {
  float a;
  float b;
  int c;

  public void memancing(int c){
    try{
      System.out.println("Memasukkan ke dalam method");
      b = 5 + c;
      a = 10 / c;
      System.out.println(a);
      System.out.println(b);
      // throw new ArithmeticException();
    }catch(ArithmeticException e){
      System.out.println("Terjadi kesalahan pada operasi matematika");
    }finally{
      System.out.println("Selama mencoba, tidak ada masalah yang terjadi");
    }
  }
  public static void main(String[] args) {
    TryCatchFin tes = new TryCatchFin();
    tes.memancing(2);
    tes.memancing(0);
  }
}
