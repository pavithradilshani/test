class Lunch {
      Lunch(){
System.out.print("My lunch");
}
}
 class Rice {
 Rice(){
 System.out.print("Contains Rice");
 }
 }
 class Curry {
    Curry(){
System.out.print("and a curry");
}
}
class Dhal {
Dhal(){
System.out.print("with Dhal");
}
}
public class MyLunch {
  private Lunch l = new Lunch();
  private Rice r = new Rice();
  private Curry c = new Curry();
  private Dhal d = new Dhal();
  public static void main(String[] args){
  new MyLunch();
  }
}
 
 