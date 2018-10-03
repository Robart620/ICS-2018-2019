package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkEleven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double velocity, mass, KE;
		
		System.out.print("Please enter the mass in kg followed by the velocity in m/s: ");
		mass = in.nextDouble();
		velocity = in.nextDouble();
		
		KE = 1.0 / 2.0 * mass * Math.pow(velocity, 2);
		
		System.out.println("The kinetic energy is: " + KE + "kg m^2/s^2");
		
		in.close();
		

	}

}
