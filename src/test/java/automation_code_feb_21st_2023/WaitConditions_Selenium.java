package automation_code_feb_21st_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitConditions_Selenium {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@Test
	public void ninjaWait() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.get("http://tutorialsninja.com/demo");
		
		WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(myAccountLink));
		myAccountLink.click();
		
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(loginLink));
		loginLink.click();
		
		WebElement emailTextbox = driver.findElement(By.id("input-email"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(emailTextbox));
		emailTextbox.sendKeys("seleniumpanda@gmail.com");
		
		 
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();
	}

}
