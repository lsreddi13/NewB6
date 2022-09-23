package com.java.basics;

public class StringCancatDemo {
	String name1 = "Selenium"; // non static vars
	String name2 = "Automation";

	static String name3 = "functional Test Automation engg.";

	public static void main(String[] args) {

		//how to create an object
		StringCancatDemo ab = new StringCancatDemo();
		
		ab.testVars();

		

		
		
		teststaticVars();
		
		System.out.println(ab.name1);
		
		String name4 = "mystring";
		System.out.println(name3);
		
		System.out.println(name4);

	}

	public void testVars() { // non static method
		
	
	
		
		System.out.println(name1 + name2);
		System.out.println(name1.concat(name2));

	}

	public static void teststaticVars() { // non static method
		
		
		
		
		System.out.println(name3);

	}

}
