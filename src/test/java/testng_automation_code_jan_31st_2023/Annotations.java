package testng_automation_code_jan_31st_2023;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is before suite annotation");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("this is before test annotation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("this is before class annotation");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is before method annotation");
	}
	
	@Test
	public void testCase1() {
		System.out.println("This is my test case number 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("This is my test case number 2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("This is my test case number 3");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this is after method annotation");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("this is after class annotation");	
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("this is after test annotation");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("this is after suite annotation");
	}

}
