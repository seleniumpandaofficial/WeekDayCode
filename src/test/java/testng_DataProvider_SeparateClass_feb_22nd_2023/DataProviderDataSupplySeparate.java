package testng_DataProvider_SeparateClass_feb_22nd_2023;

import org.testng.annotations.DataProvider;

public class DataProviderDataSupplySeparate {
	
	
	@DataProvider(name = "dataSupply")
	public String[][] dataSupplier() {
		
		String[][] data = {{"seleniumpanda@gmail.com", "Selenium@123"},
				           {"seleniumpanda1@gmail.com", "Selenium@123"},
				           {"seleniumpanda2@gmail.com", "Selenium@123"},
				           {"seleniumpanda3@gmail.com", "Selenium@1234"}};
		
		return data;
		}

}
