package com.bayviewglen.dayfour;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double Vi;
		System.out.print("Input inital velocity (m/s): ");
		Vi = in.nextDouble();
		
		double a;
		System.out.print("Input acceleration (m/s^2): ");
		a = in.nextDouble();
		
		double t;
		System.out.print("Input time elapsed (s): ");
		t = in.nextDouble();
		
		double Vf;
		Vf = Vi + a * t;
		
		System.out.println("\nThe final velocity is: " + Vf);
		
		in.close();

	}

}
