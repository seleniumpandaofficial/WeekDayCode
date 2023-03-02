package testng_hardvssoftassert_feb_7th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_Assert {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}
	
	@Test
	public void clickOnLoginTest() {
		driver.findElement(By.className("signin")).click();
		//Assert using getTitle or getCurrenturl
	}
	
	@Test
	public void enterCredentialsTest() {
		driver.findElement(By.className("signin")).click();
		//title will change here use the new title and new current url
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
	}
	
	@Test
	public void logOutTest() throws Exception {
		//find some web element inside the inbox page and validate using assert
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("rd_logout")).click();
	}
	
	@Test
	public void validateLogOutPageTest() throws Exception {
		//successfully logged out - message.... use that as a WebElement and apply Assert
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("rd_logout")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
