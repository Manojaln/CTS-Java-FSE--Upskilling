package com.data.arithmetic;
import java.util.*;
public class Calculator {

	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		//declaring two variables to get input from the user 
		double num1, num2;
		System.out.println("Enter two numbers : ");
		num1=in.nextDouble();
		num2=in.nextDouble();
		
		//allow the user to choose the operation they want to perform 
		System.out.println("Enter any one of the arithmetic operation (+,-,*,/): ");
		char operator =in.next().charAt(0);
		double result=0;
		
		switch(operator) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result =num1/num2;
			break;
		default :
			System.out.println("You entered an wrong operator !");
		}
		in.close();
		
		System.out.println("Thus"+ " " +num1 +" "+ operator +" " + num2 + " is equal to: "+ result);
		
	}
}
