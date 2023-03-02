package automation_code_jan_17th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningValidations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		System.out.println("Title of this page is : " + driver.getTitle());
		System.out.println("current url of this page is : " + driver.getCurrentUrl());
		
		driver.findElement(By.className("signin")).click();
		System.out.println("Title of this page is : " + driver.getTitle());
		System.out.println("current url of this page is : " + driver.getCurrentUrl());
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(3000);
		System.out.println("Title of this page is : " + driver.getTitle());
		System.out.println("current url of this page is : " + driver.getCurrentUrl());
		
		
        driver.findElement(By.className("rd_logout")).click();
        
        Thread.sleep(3000);
        WebElement confirmationMessage = driver.findElement(By.xpath("//p[contains(text(), "
        		+ "'You have successfully signed out of Rediffmail.')]"));
        System.out.println(confirmationMessage.isDisplayed());
        System.out.println("Title of this page is : " + driver.getTitle());
		System.out.println("current url of this page is : " + driver.getCurrentUrl());
	}

}
