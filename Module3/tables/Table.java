package com.data.tables;
import java.util.*;

public class Table {
	
	public void table (int number) {
		for (int i=1;i<=10;i++) {
			System.out.println(number+"x"+i+"="+(number*i));
			
		}
		
	}
	public static void main(String[] args) {
		Table obj=new Table();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a num :");
		int number= in.nextInt();
		
		obj.table(number);
		in.close();
	}
}