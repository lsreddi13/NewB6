package com.testng.dependsOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoDependsOn {

	@Test
	public void tm1() {
		System.out.println("this is tm1");
	}

	// create new user testcase - under construction we can not run this or it will
	// fail if you run
//pass vars from the test data name1 = "sasi1"
	@Test
	public void tm2() {
		System.out.println("this is tm2");
		Assert.assertEquals(3, 4); // when test case failed what are the reasons
		

	}

	@Test(dependsOnMethods = { "tm2" })
	public void tm3() {
		System.out.println("this is tm3");
	}

	@Test(dependsOnMethods = { "tm2" })
	public void tm4() {
		System.out.println("this is tm4");
	}
//edit user - search for name1 = "sasi"
	@Test(dependsOnMethods = { "tm2" })
	public void tm5() {
		System.out.println("this is tm5");
	}

// delete user - search for name1 = "sasi1" 
	@Test(dependsOnMethods = { "tm2" },alwaysRun = true)
	public void tm6() { //delete newly created user
		System.out.println("this is tm6");
		//delete button 
		
	}


	
	
	@Test(dependsOnMethods = { "tm2" })
	public void tm7() {
		System.out.println("this is tm7");


	}

	@Test(dependsOnMethods = { "tm2" })
	public void tm8() {
		System.out.println("this is tm8");
	}
}
