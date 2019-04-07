class A{
int i=10;

class B extends A{
public void bM(){
	System.out.println(super.i);
}
public static void main (String[]arg){
B objB = new B();

}
}
