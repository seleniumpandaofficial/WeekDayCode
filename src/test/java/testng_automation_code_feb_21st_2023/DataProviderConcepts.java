package testng_automation_code_feb_21st_2023;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcepts {
	
	//Step 1 - Return a 2 Dimensional object array
	//Step 2- Enter the rows and cols
	//Step 3 - pass the dataProvider annotation = "name of the method holding the @Data Provider
	
	@Test(dataProvider = "getData" )
	public void sampleTest(String username, String browser, int roll_number, String email) {
		
	}
	@DataProvider
	
	public Object[][] getData() {
		Object[][] data = new Object[3][4];
		
		data[0][0] = "username1";
		data[0][1] = "Chrome";
		data[0][2] = 12345;
		data[0][3] = "seleniumpanda@gmail.com";
		
		data[1][0] = "username2";
		data[1][1] = "Firefox";
		data[1][2] = 123456;
		data[1][3] = "seleniumpanda1@gmail.com";
		
		data[2][0] = "username3";
		data[2][1] = "Edge";
		data[2][2] = 1234567;
		data[2][3] = "seleniumpanda2@gmail.com";
		
		return data;
		
	}

}
