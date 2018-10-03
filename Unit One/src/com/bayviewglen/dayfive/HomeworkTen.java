package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTen {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double length, width, A, P;

		System.out.print("Please enter the length of the rectange: ");
		length = in.nextDouble();

		System.out.print("Please enter the width of the recatnage: ");
		width = in.nextDouble();

		A = length * width;
		P = 2 * (length + width);

		System.out.println("The area is: " + A);
		System.out.println("The perimeter is: " + P);

		in.close();

	}

}
