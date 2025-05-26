import java.util.*;
class Fibo{
public static int fibonumber(int num){
	if(num<=1){
return num ; }

	return fibonumber(num-1) + fibonumber(num-2);
}

public static void main(String args []){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a num :");
	int num = sc.nextInt();
	System.out.println(fibonumber(num));

}





}