package com.selenium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DemoIterator {

	public static void main(String[] args) {
		Set<String> s4 = new HashSet(Arrays.asList("dd1", "dd3","dd2", "dd5", "dd4", "dd7"));
		
		List li = Arrays.asList("asd", "dafd");
		
		s4.addAll(li);
		
		
		
		
		System.out.println(s4);
		Set<String> s = new HashSet();
		for (int i = 1; i < 10; i++) {
			s.add("dd" + i);

		}
System.out.println(s);
		Iterator<String> it = s.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}
	}

}
