package com.bayviewglen.dayfour;

import java.util.Scanner;

//declare a scanner to read input from keyboard
public class ExampleTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the length and width of the base: ");
		double length = in.nextDouble();
		double width = in.nextDouble();
		
		System.out.print("Please enter the height of the box: ");
		double height = in.nextDouble();
		
		double surfaceArea = 2 * length * width + 2 * width * height + 2 * length * height;
		
		System.out.println("The surface area of the box is: " + surfaceArea + " square metres");
		
		in.close();
		
		
	}

}
