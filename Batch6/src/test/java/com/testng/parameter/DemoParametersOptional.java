package com.testng.parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoParametersOptional {

	@Parameters({ "name", "password" })
	@Test
	public void testLogin(@Optional("selenium") String a, String b) {
		System.out.println(a + " : " + b);
	}

}
