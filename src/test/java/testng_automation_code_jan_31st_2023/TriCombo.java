package testng_automation_code_jan_31st_2023;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo {
	
	@BeforeMethod
	public void start() {
		System.out.println("I am opening the browser");
	}
	
	
	@Test
	public void testCase1() {
		System.out.println("Selenium Code");
	}
	
	
	@Test
	public  void testCase2() {
		System.out.println("Seleniumcode");
	}
	
	@AfterMethod
	public void close() {
		System.out.println("I am closing the browser");
	}

}
