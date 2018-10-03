package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double length, width, P, A;
		
		System.out.print("Please enter the length followed by the width: ");
		length = in.nextDouble();
		width = in.nextDouble();
		
		P = Math.round((2.0 * length + 2.0 * width) * 10.0)/10.0;
		A = Math.round((length * width) * 10.0) / 10.0;
		
		System.out.println("The perimeter is: " + P + ", and the area is: " + A);
		
		
		in.close(); 
	}

}
