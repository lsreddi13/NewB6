package com.selenium.tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DemoSet {
	
	
	public static void main(String[] args) {
		
		
		Set<String> s = new HashSet<String>();
		
		s.add("JAVA");
		s.add("selenium");
//		s.add("JAVA");
		s.add("testNG");
		s.add("Maven");
		s.add("Manual Testing");
		s.add("GitHub");
		s.add("Reports");
//		s.add("JAVA");
		
		
		System.out.println(s.size());
		System.out.println(s);
		
		boolean val= s.contains("core JAVA");
		System.out.println(val);
		
		
		
	}

}
