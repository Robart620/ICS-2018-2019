package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double items, pay;
	
	System.out.print("Please enter number of items sold: ");
	items = in.nextDouble();
	
	pay = Math.round((items * .27) * 100.0) / 100.0;
	
	System.out.println("The payment due is: $" + pay);
	
	in.close();
	
	}

}
