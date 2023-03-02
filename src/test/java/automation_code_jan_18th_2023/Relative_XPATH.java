package automation_code_jan_18th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Syntax1
//html[@attribute = 'valueoftheattribute']
//Syntax2
//html[@attribute1 = 'value' and @attribute2 = 'value']
//Syntax3
//html[@attribute1 = 'value' or @attribute2 = 'value']

public class Relative_XPATH {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

		driver.findElement(By.xpath("//input[@id  = 'input-firstname' or @name = 'firstname']")).sendKeys("somemailid");
		driver.findElement(By.xpath("//input[@id  = 'input-lastname']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@id  = 'input-email']")).sendKeys("somemailid@gmail.com");
		driver.findElement(By.xpath("//input[@id  = 'input-telephone']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//input[@id  = 'input-password']")).sendKeys("Some@123");
		driver.findElement(By.xpath("//input[@id  = 'input-confirm']")).sendKeys("Some@123");

		driver.findElement(By.xpath("//input[@name = 'agree']")).click();

	}

}
