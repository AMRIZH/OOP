package UAS.UAS2022;

public abstract class Member {
   abstract void presence();
   abstract void information();

   public void park(){
    System.out.println("This is park method");
   }
}

/**
 * InnerMember
 */
class implementMember extends Member {
  @Override
  void presence(){
    System.out.println("Implement absract class Member >> method presence");
  }
  @Override
  void information(){
    System.out.println("implement absract class Member >> method information");
  }
}