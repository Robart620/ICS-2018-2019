package com.bayviewglen.daysix;

public class ExampleOne {

	public static void main(String[] args) {
		//double x = Math.random();		//random number between 0.0 and 1.0. Math.random is a double
		
		//System.out.println(x);
		
		// we want a number between 0 and 9 (integer pls)
		
		//x  = (int) (Math.random() * 10);
		//System.out.println(x);
		
		//what if we want a number between 1 and 10?
		
		//x  = (int) (Math.random() * 10 + 1);
		//System.out.println(x);
		
		final int LOWER_BOUND = -10;
		final int UNIQUE_NUMBERS = 21;
		int x;
		
		int[] arr = new int[UNIQUE_NUMBERS];
		
		for(int i = 0; i<10000; i++) {
			x = (int) (Math.random() * UNIQUE_NUMBERS) + LOWER_BOUND;
			arr[x+(-LOWER_BOUND)]++;
			//System.out.println(x);
		}
			
		System.out.println("DONE");
		
	}

}
