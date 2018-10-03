package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkSeven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double C, F;
		
		System.out.print("Please enter temperature in Fahrenheit: ");
		F = in.nextDouble();
		
		C = 5.0/9.0 * (F - 32);
		
		System.out.println("The temperature in Celsius is: " + C);
		
		
		in.close();

	}

}
