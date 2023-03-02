package testng_hardvssoftassert_feb_7th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TN_SoftAssert {
	
	public static WebDriver driver;
	public static SoftAssert softassert;
	
	@BeforeMethod
	public void openTN() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
	}
	
	@Test
	public void loginTest() throws Exception {
		
		softassert = new SoftAssert();
		
		String actualTitle = "Your Store";
		String expectedTitle = driver.getTitle();
		
		softassert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//a[@title = 'My Account']")).click();
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		WebElement validatedLogin = driver.findElement(By.xpath("//a[contains(text(), 'Edit your account information')]"));
		softassert.assertTrue(validatedLogin.isDisplayed());
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		
		String logoutConfirmationMessage = "You have been logged off your account. It is now safe to leave the computer.";
		
		WebElement conf = driver.findElement(By.xpath("//p[text() = 'You have been logged off your account. It is now safe to leave the computer.']"));
		softassert.assertEquals(conf.getText(), logoutConfirmationMessage);
		
		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		
		softassert.assertAll();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
