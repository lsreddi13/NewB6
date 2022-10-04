package com.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoParameters2 {

	@Parameters({ "name", "password" })
	@Test
	public void testLogin(String x, String y) {
		System.out.println(x + " : " + y);
	}

}
