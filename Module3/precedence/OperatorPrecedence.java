package com.data.precedence;

public class OperatorPrecedence {
	public static void main (String args[]) {
		int theoutputresult = 10 + 2  * 3 - (4/2);
		/* order of operation , thus java use BODMAS rule to execute expressions 
		  thus in the above operation
		 first it solve the brackets --> 4/2 =2 
		 then it do multiplication --> 2*3 =6
		 then add and subtract from left to right -->10+6=16 , then 16-2 =14
		 thus the result is 14
		*/
		System.out.println("Result : "+theoutputresult );
	}
}
