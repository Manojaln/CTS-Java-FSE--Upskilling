package com.data.oddoreven;
import java.util.*;
public class OddOrEven {

	public static void main(String args[]) {
		// getting input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check either it is odd or even : ");
		int in=sc.nextInt();
		//check if the number is odd or even 
		if(in%2==0) {
			System.out.println("The number "+in+" "+"is even");
		}
		else System.out.println("The number "+in+" "+"is odd");
	}
}
