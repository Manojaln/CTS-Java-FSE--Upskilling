import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
public class WriteInFile{

	public static void main(String args[]){

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter content to write to the file");
	String infromuser = sc.nextLine();

	try{
	FileWriter wr = new FileWriter("filewrite.txt");
	wr.write(infromuser);
	wr.close();
	System.out.println("Content writtened in the file");
	
}catch(IOException e){
	System.out.println("Error occured");
	e.printStackTrace();
}



}
}