import java.io.file;
import java.util.Scanner;
public class FileRead{
	
	public static void main(String[]args) throws Exception{
		//pass the path to the file as a parameter
	File file = new File("D:\\java\\mytext.txt");
     Scanner sc = new Scanner(file);

while(sc.hasNextLine())
System.out.println(sc.nextLine());
	}
}	