package com.testng.dataprovidor;

import org.testng.annotations.Test;


public class DemoDataProviderTest {
	@Test(enabled = false, priority = 0, description = "print values from data provider", dataProvider = "test1")
	public void verifyData1(String a, Integer n2) {
		System.out.println(a + " " + n2);
	}

	@Test(dataProvider = "createUSer", dataProviderClass = DataProvidorDump.class) // dataprovider taking from another
																					// class from anotehr package.
	public void printNewUserData(String a, String b, String c, String d, String e, String f) {
		System.out.println(a + " : " + b + " : " + c + " : " + d + " : " + e + " : " + f);

	}

	@Test(dataProvider = "userdata", enabled = false)
	public void printUserLogindata(String name, String password) {
		System.out.println(name + " : " + password);
	}

}
