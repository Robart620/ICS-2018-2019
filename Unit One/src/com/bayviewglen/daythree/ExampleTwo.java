package com.bayviewglen.daythree;

public class ExampleTwo {

	public static void main(String[] args) {
		int number = 58674;
		
		// add the  individual digits in the number and display the sum.
		
		int digit1 = number / 10000;		//5
		int digit5 = number % 10;			//4
		int digit2 = number / 1000 % 10;	//8		(number / 1000) = 58 ; 58 % 10 = 8
		int digit3 = number /100 % 10;		//6
		int digit4 = number % 100 / 10; 	//7		(number % 100) = 78 ; 78  / 10 = 7
		
		int sum = digit1 + digit2 + digit3 + digit4 + digit5;
		
		System.out.println(sum);

	}

}
