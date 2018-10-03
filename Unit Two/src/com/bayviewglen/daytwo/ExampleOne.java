package com.bayviewglen.daytwo;

public class ExampleOne {

	public static void main(String[] args) {
		int x = 712;
		
		System.out.println("This is the number: " + x);
		
		System.out.printf("This is the number: %d\n", x);
		
		int num1 = 10;
		int num2 = 19;
		int sum = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		
		
		
		double a = 1.459456;
		double b = 4.905895;
		double c = a + b;
		
		System.out.println(a + " + " + b + " = " + c);
		System.out.printf("%5.5f + %5.5f = % 5.5f\n", a, b, c);
		
		double num = -4.5;
		
		System.out.printf("%-+1.3f\n", num);
		
		int minutes = 5;
		int minutes1 = 11;
		double seconds = 34.2;
		
		System.out.printf("%3d:%6.3f%n", minutes, seconds);
		System.out.printf("%3d:%6.3f\n", minutes1, seconds);
		
		String name = "Philip";
		
		System.out.printf("Hello, %s, how are you today?", name);
	}

}
