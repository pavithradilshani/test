import java.util.Scanner;
public class Exc3{
public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	try{
  System.out.println("Enter a number");
  int n = scan.nextInt();
  System.out.println("n= " + n);
}catch (exception e){
	System.out.println("Exception:" + e.getMessage());
}
finally{
System.out.println("Make sure you input an integer");
}
System.out.println("Testing...");
  
  }
}
