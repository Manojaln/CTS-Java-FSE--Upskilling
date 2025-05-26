import java.util.*;
public class SumAndAverage {

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int sumofarr=0;
	float averageofarr=0;
	System.out.println("Enter the size of arr");
	int si = sc.nextInt();
	int [] ar =new int[si];
	System.out.println("Enter the elements of arr");
	for(int in =0;in<si;in++){
		ar[in]=sc.nextInt();
	}
	for(int y=0;y<si;y++){
		sumofarr = sumofarr + ar[y];
}

	averageofarr = sumofarr/si;
	System.out.println("Sum of the array is : "+sumofarr);
	System.out.println("Average of the array is : "+ averageofarr );



}





}