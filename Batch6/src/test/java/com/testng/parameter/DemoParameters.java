package com.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoParameters {

	@Parameters({ "name", "password" })
	@Test(enabled = false)
	public void testLogin(String a, String b) {
		System.out.println(a + " : " + b);
	}

}
