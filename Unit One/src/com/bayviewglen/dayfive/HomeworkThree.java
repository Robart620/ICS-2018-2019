package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double years, minutes;
		
		System.out.print("Please eater the number of years: ");
		years = in.nextDouble();
		
		minutes = years * 365 * 24 * 60;
		
		System.out.println(minutes);
		
		in.close();

	}

}
