package automation_code_jan_24th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[@class = 'caret']/preceding-sibling::span[1]")).click();
		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.xpath("//input[@id  = 'input-firstname' or @name = 'firstname']")).sendKeys("somemailid");
		driver.findElement(By.xpath("//input[@id  = 'input-lastname']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@id  = 'input-email']")).sendKeys("somemailid12345@gmail.com");
		driver.findElement(By.xpath("//input[@id  = 'input-telephone']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//input[@id  = 'input-password']")).sendKeys("Some@1234");
		driver.findElement(By.xpath("//input[@id  = 'input-confirm']")).sendKeys("Some@1234");

		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		//Validation for Account creation
		
		WebElement proofOfAccountCreation = driver.findElement(By.xpath("//h1[contains(text(), 'Your Account Has Been Created!')]"));
		if(proofOfAccountCreation.isDisplayed()) {
			driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		}
		
		driver.findElement(By.linkText("Logout")).click();
		
		//Validation for Logout
		
		WebElement proofOfLogout = driver.findElement(By.xpath("//h1[contains(text(), 'Account Logout')]"));
		if(proofOfLogout.isDisplayed()) {
			driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		}
		
		driver.findElement(By.xpath("//span[@class = 'caret']/preceding-sibling::span[1]")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("somemailid12345@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Some@1234");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
        
	}

}
