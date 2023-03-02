package testng_why_use_ObjectArray_feb_22nd_2023;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(dataProvider = "dataSupply")
	public void sampleTest(Object language, Object status, Object rank, Object situation) {
		System.out.println(language + " : " + status + " : " + rank + " : " + situation);
	}
	
	
	@DataProvider
	public Object[][] dataSupply() {
		
		Object[][] data = {{"Java", "learning", 2, false},
		                   {"python", "yettolearn", 3, true}};
		
		return data;
		
	}

}
