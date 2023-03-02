package automation_code_jan_17th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations_At_WebElement_Level {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		WebElement checkBox = driver.findElement(By.id("remember"));

		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());

		if (checkBox.isEnabled() && checkBox.isDisplayed() && checkBox.isSelected())

		{

			driver.findElement(By.name("proceed")).click();
		}

	}

}
