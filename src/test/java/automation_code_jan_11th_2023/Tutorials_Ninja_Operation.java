package automation_code_jan_11th_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorials_Ninja_Operation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		//method chaining
		driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
	    //FirstName
	    driver.findElement(By.id("input-firstname")).sendKeys("seleniumpanda");
	    driver.findElement(By.id("input-lastname")).sendKeys("1001");
	    driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1001@gmail.com");
	    driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
	    driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
	    driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
	    driver.findElement(By.name("agree")).click();
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	    
	    
	}

}
