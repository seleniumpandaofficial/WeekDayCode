package automation_code_jan_24th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Select_DropDown {
	
	public static Select select;

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		
		//Create the object of Select class dropdown and pass the location in the constructor
		
		//there are 3 methods under Select class which are selectbyVisibleText, selectByIndex, SelectByvalue
		
		Thread.sleep(3000);
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jul");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("20");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1971");
		
		

	}

}
