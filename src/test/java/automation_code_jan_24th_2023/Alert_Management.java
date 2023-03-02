package automation_code_jan_24th_2023;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Management {

	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	
	Thread.sleep(3000);
	
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	
	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	
	
	
	}

}
