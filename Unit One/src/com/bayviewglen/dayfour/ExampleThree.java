package com.bayviewglen.dayfour;

import java.util.Scanner;

//
public class ExampleThree {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a 3 digit integers: ");
		
		int number;
		number = in.nextInt();
				
		if (number < 99 || number > 999) {
			throw new IllegalArgumentException("Enter a 3 digit number");
		
		}
		int x = number % 10;
		int y = number / 10 % 10;
		int z = number / 100;
		int sum = x + y + z;
		
		System.out.println("The sum of the numbers is: " + sum);
		

		in.close();
		}

	}

