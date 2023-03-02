package testng_automation_code_feb_7th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Rediff {

	public static WebDriver driver;
	public static SoftAssert softassert;

	@BeforeMethod
	public void openWebSite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}

	@Test
	public void rediffTest() {
		
		softassert = new SoftAssert();

		String expectedTitle = driver.getTitle();
		String actualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";

		softassert.assertEquals(expectedTitle, actualTitle);

		if (expectedTitle.equals(actualTitle)) {
			driver.findElement(By.className("signin")).click();

			softassert.fail("Some reason");
			
			if(true == true) {
				System.out.println("The world is beautiful");
			}
			
			softassert.assertAll();
			
	    //   Assert.assertTrue(1<2);
	    //Assert.assertTrue(1>2);
		}
	}
	
	
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
