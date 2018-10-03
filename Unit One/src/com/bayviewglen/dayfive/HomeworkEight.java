package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkEight {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double number, square, root;

		System.out.print("Please enter a positive number: ");
		number = in.nextDouble();

		square = Math.pow(number, 2);
		root = Math.pow(number, (1.0 / 2.0));

		System.out.println("The square is: " + square + " and the square root is: " + root);

		in.close();

	}

}
