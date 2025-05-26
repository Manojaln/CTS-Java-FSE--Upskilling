package com.data.leapyear;

import java.util.Scanner;

public class LeapYearCheck {
	public static void main(String args[]) {
		
	// getting input from the user
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a year to check whether it is leap year or not : ");
			int n=sc.nextInt();
			
			 boolean isLeapYear = false;
			 // check whether it is divisible by 4
			 if(n%4==0) {
				 isLeapYear=true;
				//check it is century or not 
				 if(n%100==0) {
					 //if it century then check it is divisible by 400
					 if(n%400==0) {
						 isLeapYear=true;
					 }
					 else isLeapYear=false;
				 }
			 }
			 
			 //when year is not divisible by 4 then its not leap year
			 else {
				 isLeapYear=false;
			 }
			 
			 if(!isLeapYear) {
				 System.out.println(n+" "+"is not a leap year");
			 }
			 else System.out.println(n+" "+"is leap year");
		}
}
