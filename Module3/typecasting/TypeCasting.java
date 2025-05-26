package com.data.typecasting;

public class TypeCasting {
	public static void main (String args[]) {
		// declaring double 
		double doublea = 10.123456d;
		//type casting double to intger (we have to manually type cast it 
		int  inta = (int) doublea;
		
		//declaring int 
		int intb= 10;
		//type casting integer to double (its automatically type cast itself)
		double doubleb= intb;
		
		System.out.println("Declaring double : "+doublea);
		System.out.println("Converting double to integer : "+inta);
		System.out.println();
		
		System.out.println("Decalaring integer : "+ intb);
		System.out.println("Converting integer to double : "+doubleb);
		
		
	}
}
