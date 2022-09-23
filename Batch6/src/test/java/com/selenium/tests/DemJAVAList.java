package com.selenium.tests;

import java.util.ArrayList;
import java.util.List;

public class DemJAVAList {

	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();

		li.add("selenium");
		li.add("JAVA");
		li.add("testNG");
		li.add("Maven");
		li.add("Manual Testing");
		li.add("GitHub");
		li.add("Reports");
		li.add("JAVA");
		
		
		List<String> li2 = new ArrayList<String>();

		li2.add("selenium");
		li2.add("Advanced JAVA");
		li2.add("testNG");
		li2.add("Maven");
		li2.add("Manual Testing");
		li2.add("GitHub");
		li2.add("Reports");

		System.out.println(li.size());

		System.out.println(li);
		
		boolean val = li.equals(li2);
		System.out.println("two lists are equals ? : "+ val);

		/*
		 * boolean value = li.contains("Advanced JAVA");
		 * 
		 * System.out.println("Value is displayed ? : " + value);
		 * 
		 * li.remove(6); System.out.println(li.size());
		 * 
		 * System.out.println(li);
		 * 
		 * li.clear(); System.out.println(li.size());
		 * 
		 * System.out.println(li);
		 */
	}

}
