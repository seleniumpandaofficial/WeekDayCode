package testng_DATA_DRIVEN_TESTING_feb_22nd_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ninja_TooMuchData {

	public static WebDriver driver;
	public static SoftAssert softassert = new SoftAssert();

	@Test(dataProvider = "dataSupply")
	public void loginAllTest(String[] str) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(str[0]);
		driver.findElement(By.id("input-password")).sendKeys(str[1]);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		softassert.assertAll();
		driver.quit();

	}
	
	@DataProvider(name = "dataSupply")
	public String[][] dataSupplier() {
		
		String[][] data = {{"seleniumpanda@gmail.com", "Selenium@123"},
				           {"seleniumpanda1@gmail.com", "Selenium@123"},
				           {"seleniumpanda2@gmail.com", "Selenium@123"},
				           {"seleniumpanda3@gmail.com", "Selenium@1234"}};
		
		return data;
		}
		
	}



