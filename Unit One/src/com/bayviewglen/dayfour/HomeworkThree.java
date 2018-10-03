package com.bayviewglen.dayfour;
import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int number, second, forth, product;
		
		System.out.print("Please enter a 5 digit number: ");
		
		number = in.nextInt();
		second = (number / 1000) % 10;
		forth = (number /10) % 10;
		product = forth * second;
		
		System.out.println("The product of the second and forth digit is: " + product);
				
		in.close();
		
	}

}
