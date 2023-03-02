package testng_automation_code_feb_1st_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openTutorialsNinjaWebsite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
	}
	
	@Test
	public void clickOnMyAccount() {
		driver.findElement(By.linkText("My Account")).click();
		Assert.fail("As per the assignment");
	}
	
	@Test(dependsOnMethods = "clickOnMyAccount", alwaysRun = true)
	public void loginFunctionality() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@Test(dependsOnMethods = {"clickOnMyAccount", "loginFunctionality"}, alwaysRun = true, invocationCount = 5)
	public void logoutFunctionality() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
