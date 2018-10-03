package com.bayviewglen.daytwo;

public class HomeworkTwo {

	public static void main(String[] args) {

		// Area of a circle
		double r;
		double A;
		double pi = Math.PI;

		r = 8;
		A = Math.pow(r, 2) * pi;

		System.out.println("The area of the circle with radius " + r + " is: " + A);

		// Volume of a sphere
		double V;

		V = (4.0/3 *Math.pow(r, 3) * pi);

		System.out.println("\n\nThe volume of the sphere with radius " + r + " is: " + V);

		// Quadratic equation
		double x;
		double y;
		double a;
		double b;
		double c;

		a = -1;
		b = 1;
		c = 1;
		x = 1;

		y = a * Math.pow(x, 2) + b * x + c;

		System.out.println("\n\nThe solution to the quadratic equation with parameters:");
		System.out.println("a = " + a + "\nb = " + b + "\nc = " + c + "\nx = " + x);
		System.out.println("is: " + y);

		// Slope of a line
		int x1, x2;
		int y1, y2;
		double m;

		x1 = 0;
		y1 = 0;
		x2 = 2;
		y2 = 1;

		m = (double) (y2 - y1) / (x2 - x1);

		System.out.println("\n\nThe slope of the line that goes through coordinates:");
		System.out.println("(" + x1 + "," + y1 + ") , (" + x2 + "," + y2 + ")");
		System.out.println("is: " + m);

		// Money
		double pennies, nickles, dimes, quarters, loonies, toonies;
		double total;

		pennies = 1;
		nickles = 1;
		dimes = 1;
		quarters = 1;
		loonies = 1;
		toonies = 1;

		total = pennies * 0.01 + nickles * 0.05 + dimes * 0.10 + quarters * 0.25 + loonies * 1.00 + toonies * 2.00;

		System.out.println("\n\nYou have: $" + total);

		// Quadratic formula
		double x1Root, x2Root;

		x1Root = (double)((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
		x2Root = (double)((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
		
		if (Double.isNaN(x1Root)) {
			System.out.println("\n\nThere are no roots for the quadratic equation with parameters:");
			System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);

		} else {
			System.out.println("\n\nThe roots for the quadratic equation with parameters:");
			System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
			System.out.println("are: (" + x1Root + ",0.0) , (" + x2Root + ",0.0)");
		}
	}
}
