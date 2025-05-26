package com.data.grade;
import java.util.*;
public class GradeCalculator {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your mark");
		int mark =in.nextInt();
		//checking the grade
		if (mark >= 90 && mark <= 100) {
            System.out.println("Your grade is: A");
        } 
		else if (mark >= 80 && mark < 90) {
            System.out.println("Your grade is: B");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("Your grade is: C");
        	} 
        else if (mark >= 60 && mark < 70) {
            System.out.println("Your grade is: D");
        } 	else if (mark >= 0 && mark < 60) {
            System.out.println("Your grade is: F");
        } 
        else {
            System.out.println("Invalid marks.");
        }

        in.close();
	}
}
