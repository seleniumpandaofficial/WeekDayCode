package testng_automation_code_feb_7th_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void openWebSite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
	}
	
	@Test
	public void flipkartTest() {
		System.out.println("Code for Flipkart is here");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
