class OuterClass{
private int i =10;
private String str = "I am private";
public void CreateInner(){
 InnerClass ObjInner = new InnerClass();
 ObjInner.display();
 }
 class InnerClass{
 public void display(){
 System.out.println("i= "+i);
 System.out.println(str);
 }
 }
}
class MainClass{
	public static void main(String[]args){
		OuterClass OuterClassobj = new OuterClass();
		OuterClass.InnerClass InnerClassobj = OuterClassobj.new InnerClass();
		InnerClassobj.display();
	}
}

