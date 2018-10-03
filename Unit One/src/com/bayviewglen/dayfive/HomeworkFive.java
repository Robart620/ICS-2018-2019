package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFive {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double wins, loses, percentRound, percent;
	
	System.out.print("Please enter number of wins: ");
	wins = in.nextDouble();
	
	System.out.print("Please enter number of loses: ");
	loses = in.nextDouble();
	
	percent = (wins/(wins + loses) * 100.0);
	
	System.out.println(percent);
	percentRound = Math.round(percent * 1000.0) / 1000.0;
	
	System.out.println("The win percentage is: " + percentRound + "%");
	
	in.close();
	

	}

}
