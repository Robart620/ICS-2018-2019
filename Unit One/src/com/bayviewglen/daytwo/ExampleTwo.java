package com.bayviewglen.daytwo;

/*
 * Primitive data: double
 */

public class ExampleTwo {
	/*
	 * get the average of the marks. do it twice.
	 */

	public static void main(String[] args) {
		double markOne, markTwo, markThree; // double stores decimal vaules, also refered to as floating point decimals
		double averageMark;

		markOne = 75;
		markTwo = 95;
		markThree = 63;

		averageMark = (markOne + markTwo + markThree) / 3;

		System.out.println("The average of the three marks was: " + averageMark);

		// note that it displays a decimal. if the three marks were 10, 10, and 10, it
		// would return 10.0

		int testOne, testTwo, testThree;

		testOne = 70;
		testTwo = 75;
		testThree = 70;

		// the average should be 71.667

		averageMark = (testOne + testTwo + testThree) / 3; // both operands are ints, so we do integer division, which
															// gives the answer without a remainder

		System.out.println("The average of the three marks was: " + averageMark);
		// it returns 71.0
		// averageMark is a double, so it displays as a decimal, but an unexpected value

		averageMark = (testOne + testTwo + testThree) / 3.0; // one of the operands is a double, so we do double
																// division.

		System.out.println("The average of the three marks was: " + averageMark);

		averageMark = (double) (testOne + testTwo + testThree) / 3; // the 'double' in round brackets casts the first
																	// operand as a double

		System.out.println("The average of the three marks was: " + averageMark);

		averageMark = (double) ((testOne + testTwo + testThree) / 3); // this one takes the answer (int 71.0) and casts
																		// it as an double. since 71.0 is being returned
																		// as a double, the answer is 71.0

		System.out.println("The average of the three marks was: " + averageMark);
	}

}
