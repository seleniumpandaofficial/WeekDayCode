package testng_parameterization_Feb_7th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rediff {
	
	public static WebDriver driver;
	
	@Test
	@Parameters({"Browser", "url", "username", "password"})
	public void checkRediff(String Browser, String url, String username, String password) throws Exception {
		
		if(Browser.equals("Chrome")) {
		driver = new ChromeDriver();    
		driver.manage().window().maximize();
		} else if(Browser.equals("Firefox")) {
			driver = new FirefoxDriver();    
			driver.manage().window().maximize();	
		}
		
		driver.get(url); //url 
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys(username); //username
		driver.findElement(By.id("password")).sendKeys(password); //password
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("rd_logout")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
	}
	
	

}
