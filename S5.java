import java.util.Scanner;
class S5{
    public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	
	System.out.print("enter name:");
	String name = scan.nextLine();
	
	System.out.print("Enter employee Id:");
	int id = scan.nextInt();
	
	System.out.println("gender");
	char gender = scan.next().charAt(0);
	
	System.out.println("Name:" +name);
	System.out.println("EID:" + id);
	System.out.print("Gender:" + gender);
	}
	}