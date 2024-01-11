package UAS;

public class InterfaceDemo implements Read{
  @Override
    public void write(){
        System.out.println("Amri zadi Hudaya");
    }
    
    @Override
    public void reading(){
        System.out.println("L200224288");
    }
    
    public void studying(){
        System.out.println("UMS");
    }
    public static void main(String[] args) {
        InterfaceDemo id = new InterfaceDemo();
        id.reading();
        id.write();
        id.studying();
    }
}
