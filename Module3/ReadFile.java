import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile{

public static void main(String args[]){
	try{
	BufferedReader br= new BufferedReader(new FileReader("filewrite.txt"));
	String tx;
	System.out.println("Content in filewrite.txt");
	while((tx = br.readLine()) != null){
	System.out.println(tx);
	}
br.close();
}catch(IOException e){
	System.out.println("Error");
	e.printStackTrace();
}
	
}
}