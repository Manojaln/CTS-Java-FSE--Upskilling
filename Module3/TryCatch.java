import java.util.*;
public class TryCatch{
	public static void main(String args[]){
	Scanner scn = new Scanner(System.in);

try{
	System.out.println("Enter 1st num: ");
	int a1=scn.nextInt();
	System.out.println("Enter 2nd num: ");
	int a2=scn.nextInt();
	float res = a1/a2;
	System.out.println(res);	

}

catch (ArithmeticException e){
 System.out.println(e);
}
	}
}