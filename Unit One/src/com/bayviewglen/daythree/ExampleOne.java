package com.bayviewglen.daythree;

public class ExampleOne {

	// integer division
	public static void main(String[] args) {
		int x = 344;
		int y = 3;

		double z = x / y;

		System.out.println(z);

		int remainder = x % y; // modulus operator. Gets us the remainder

		System.out.println(remainder);

		if (x % 3 == 0) {
			System.out.println("divisible by 3");

		} else {
			System.out.println("not divisible by 3");

		}

		for (int counter = 0; counter < 100; counter++) {
			if (counter % 9 == 0) {
				System.out.println(counter);
			}

		}

	}

}
