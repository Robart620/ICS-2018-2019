package com.bayviewglen.dayfour;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double score, total;
		double mark;
		
		System.out.print("Please enter the student's score, followed by maximum score:");
	
		score = in.nextInt();
		total = in.nextInt();
		
		mark = ((double)score / (double) total);
		System.out.println(score);
		System.out.println(total);
		mark = score / total * 100;
		System.out.println("The student's mark is: " + mark + "%");
		
		in.close();
				
	}

}
