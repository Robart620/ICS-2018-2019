package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkSix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double mass, velocity, momentum;
		
		System.out.print("Please enter the mass in kg: ");
		mass = in.nextDouble();
		
		System.out.print("Please enter the velocity in m/s^2: ");
		velocity = in.nextDouble();
		
		momentum = velocity * mass;
		
		System.out.println("The momentum is: " + momentum + "kg m/s^2");
		
		in.close();

	}

}
