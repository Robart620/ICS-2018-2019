package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double price, tax, total;
		
		System.out.print("Please input price: $");
		price = in.nextDouble();
		
		System.out.print("Please input tax as a decimal: ");
		tax = in.nextDouble();
		
		total = price + price * tax;
		
		System.out.println("The toal is: $" + total);
		
		in.close();
			
		
		

	}

}
