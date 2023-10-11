package modul9;

abstract class AbstrakClass {
  int a;
  int b;
  int c;
  
  public AbstrakClass(int a, int b, int c){
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int kali(){
    return a*b*c;
  }

  public static void main(String[] args) {
    //AbstrakClass ac = new AbstrakClass(2,3,4);
  }
}