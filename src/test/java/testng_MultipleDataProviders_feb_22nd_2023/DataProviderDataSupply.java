package testng_MultipleDataProviders_feb_22nd_2023;

import org.testng.annotations.DataProvider;

public class DataProviderDataSupply {
	

	@DataProvider(name = "ninjaDataSupply")
	public Object[][] ninjaDataSupplier() {
		
		Object[][] data = {{"seleniumpanda@gmail.com", "Selenium@123"},
				           {"seleniumpanda1@gmail.com", "Selenium@123"},
				           {"seleniumpanda2@gmail.com", "Selenium@123"},
				           {"seleniumpanda3@gmail.com", "Selenium@1234"}};
		
		return data;
		}
	
	
	@DataProvider(name = "rediffDataSupply")
	public Object[][] rediffDataSupplier() {
		
		Object[][] data = {{"seleniumpanda@rediffmail.com", "Selenium@123"},
				           {"seleniumpanda1@rediffmail.com", "Selenium@123"},
				           {"seleniumpanda2@rediffmail.com", "Selenium@123"}};
				          
		
		return data;
		}
	

}
