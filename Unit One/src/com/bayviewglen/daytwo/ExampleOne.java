package com.bayviewglen.daytwo;

/*
 * Topics Covered:
 * 1. Declaring variables
 * 2. Primitive data types
 * 3. Assignment Operator 
 * 4. String concatenation 
 * SelectAll + CTRL + SHIFT + F    for indent
 */
public class ExampleOne {
	public static void main(String[] args) {
		int x = 27;		//x and y will store ints (integers)
		int y;		//red squiggle are errors, yellow are warnings 
		y = 23;
		
		int z;		//z will be the sum of x and y
		
		z = x + y;		//z is assigned x + y. A single '=' is the assingment opperator 
		
		System.out.println(z);		//displays value stored in z to console

		
		//declare variable where you need them the first time
		
		int numberOne, numberTwo;		//you can declare multiple variables in the same line if separated with a comma
		
		numberOne = 18;
		numberTwo = 19;
		
		int sum = numberOne + numberTwo;		//in this line, we declared variable, assigned value (assigned it on the same line) even if the initialization uses a function or some math
		
		
		System.out.println(numberOne + " + " + numberTwo + " = " + sum);
		
		
		
	}

}
