import java.util.*;
public class Palindrome{

public static void main (String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String: ");
	String read = sc.nextLine();
	String newread = read.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
 	String rev ="";
	for(int in =newread.length() -1; in>=0 ; in--){
		rev = rev + newread.charAt(in);
	}
	if(rev.equals(newread)){

	System.out.println("Yes "+read+" is a palindrome");
}
else System.out.println(read+" is not a palindrome");


}

}