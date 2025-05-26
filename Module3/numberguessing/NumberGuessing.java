package com.data.numberguessing;
import java.util.*;
public class NumberGuessing {
	public static void main(String args[]) {
		
		Scanner in=new Scanner(System.in);
		Random randomnum =new Random();
		// Generating random number
		int targetNumber = randomnum.nextInt(100) + 1;
		
		int guess;
		//Loop until the user find the correct answer
		while(true) {
			System.out.println("Enter your guess :");
			guess =in.nextInt();
			
			if(guess<1 || guess>100) {
				 System.out.println("Enter number between 1 - 100");
			}
			else if( guess > targetNumber){
				System.out.println("Too high! Try again.");		
			}
			else if( guess < targetNumber){
				System.out.println("Too low ! Try again.");		
			}
			else {
				System.out.println("Congratulation you guessed the correct number , the number is : "+targetNumber);
				break;
			}
		}
	}
}
