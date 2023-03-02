package automation_code_jan_11th_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_WebElement_Understanding {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver(); //Ctrl + Shift + O
		driver.manage().window().maximize(); //method chaining
		driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //Please press Ctrl + S  = save your program
	    driver.get("https://rediff.com");
	    driver.findElement(By.linkText("Rediffmail")).click();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Money")).click();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Business Email")).click();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Videos")).click();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Shopping")).click();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Create")).click();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    

	}

}
