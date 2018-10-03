package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double years, distance; 
		
		System.out.print("Please enter the number of years: ");
		years = in.nextDouble();
		
		distance = 525600 * 60 * 3 * Math.pow(10.0, 8.0) * years; 
		
		System.out.println("The distance traveled is: " + distance);
		
		in.close();
		
		
		
		

	}

}
