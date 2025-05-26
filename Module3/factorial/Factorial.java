package com.data.factorial;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int input_in=sc.nextInt()
;		float fact=1;
		for(int in=1;in<=input_in;in++) {
		fact=fact*in;
}		System.out.println("Factorial is : "+ fact);
		
		}
}
