package com.bayviewglen.dayfour;

public class ExampleFour {
	// Short cut assignment operators

	public static void main(String[] args) {
		int x = 7;
		int y = 10;
		
		System.out.println(x++);	//does system.out THEN the ++
		System.out.println(x);
		
		System.out.println(++y);	//does the ++ THEN the system.out
		System.out.println(y);
		
		
		int sum = x++ + y;
		System.out.println(x);		//8
		System.out.println(y);		//10
		System.out.println(sum);	//17
		
		//-- takes away 1, following the same rules as ++
		
		//x++; same as x = x +1;
		x = x + 3;	//same as bellow
		
		x += 3;		//same as above
		x -= 3;
		
		x *= 5;
		x /= 5;
		
		
		//-= , *= , /=, %= all act by same rules with their operations. 
	}

}
