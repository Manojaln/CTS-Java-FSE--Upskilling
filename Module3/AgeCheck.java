import java.util.*;

public class AgeCheck{
public static void check(int age) throws InvalidExp{
	if (age<18){
	throw new InvalidExp ("Age must be above 18");
}	else System.out.println("You are eligible to vote");

}

public static void main(String args[]){

	Scanner sc =new Scanner(System.in);
	System.out.println("Enter age: ");
	try{
	int ag=sc.nextInt();
	check(ag);
}	catch (InvalidExp e){
	System.out.println(e.getMessage());
}
}

}