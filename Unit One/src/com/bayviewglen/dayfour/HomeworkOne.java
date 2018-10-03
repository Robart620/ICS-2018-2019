package com.bayviewglen.dayfour;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		//Problem 1
		Scanner in1 = new Scanner(System.in);
		double number, number2;
		
		System.out.print("Please enter a number: ");
		
		number = in1.nextDouble();
		number2 = Math.pow(number, 2);
		
		System.out.println("The square of the numer: " + number + " is: " + number2);
		
		in1.close();
		
	}
}