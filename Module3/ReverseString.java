import java.util.*;
public class ReverseString{

public static void main (String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String to reverse it: ");
	String read = sc.nextLine();
 	String rev ="";
	for(int in =read.length() -1; in>=0 ; in--){
		rev = rev + read.charAt(in);
	}

	System.out.println("The reversed String is : " + rev);


}

}