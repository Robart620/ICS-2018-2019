package com.bayviewglen.dayone;

public class ExampleOne {
		//introduction to the string class
	public static void main(String[] args) {
		// A string is just a sequence of characters
		// A string of characters 
		
		//A string is an object type. It is NOT primitive
		
		String str = "This is a String";
		
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.substring(1, 4));	//[start, end)
		
		System.out.println(str.substring(8));		//[start, str.length)
		System.out.println(str.substring(8, str.length()));
		
		String name1 = "alpha";
		String name2 = "bet";
		
		System.out.println(name1.compareTo(name2));
		System.out.println(name2.compareTo(name1));
		System.out.println(name1.compareTo(name1));
		
		// if the sequence have the same sequence of characters, compare returns 0
		//if the string that calls the method is greater than the string it was being compared to it returns a possitive
		// Ex "Jason".compareTo("Jackson") returns a positive int
		//if the string that calls the method is less than the string it was being compared to it returns a negative
		// Ex "Jackson".compareTo("Jason") returns a negative int
		
		System.out.println('A'+'A');		// single quotes for characters
		
		//use ASCII table to compare characters (and strings)
		
		String a = "hello";
		String b = "hello";
		
		System.out.println(a == b);
		
		
		String x = new String("hello");
		String y = new String("hello");
		
		System.out.println(x == y);
		
		System.out.println(x.compareTo(y) == 0);
		
		System.out.println(x.equals(y));
		
		
	}

}
