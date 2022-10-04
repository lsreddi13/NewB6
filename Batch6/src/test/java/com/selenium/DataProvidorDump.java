package com.selenium;

import org.testng.annotations.DataProvider;

public class DataProvidorDump {

	@DataProvider(name = "test1")
	public Object[][] createData1() {

		return new Object[][] { { "Cedric", new Integer(36) }, { "Anne", new Integer(37) }, };
	}

	@DataProvider(name = "userdata")
	public Object[][] getTestData() {

		return new Object[][] { { "Admin", "admin123" }, // first row
				{ "Annette", "password123" }, // second row
				{ "Ramesh", "ramesh123" }, // third row
				{ "Santhosh", "santhosh123" }, // third row
		};
	}

	@DataProvider(name = "createUSer")
	public Object[][] getCreateUserTestData() {

		return new Object[][] { { "Admin", "peter", "Enabled", "Ramesh", "ramesh123", "ramesh123" }, // first row
				{ "ESS", "daniel", "Enabled", "Vikram", "vikram123", "vikram123" }, // second row
				{ "Admin", "peter", "Enabled", "santhos", "santhos", "santhos" }, // third row
				{ "ESS", "daniel", "Enabled", "Raju", "raju123", "raju123" } // third row
		};
	}

}
