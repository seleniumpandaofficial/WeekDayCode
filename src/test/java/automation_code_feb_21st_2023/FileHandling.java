package automation_code_feb_21st_2023;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandling {
	
	//how to read from a properties.file
	//Step 1 - create a properties file
	//Step 2 - Create the object of Properties Class
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		System.out.println(System.getProperty("user.dir"));
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\automation_code_feb_21st_2023\\config.properties");
		prop.load(ip);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText(prop.getProperty("linkTextofMyAccount"))).click();
		driver.findElement(By.linkText(prop.getProperty("linkTextofLogin"))).click();
		driver.findElement(By.id(prop.getProperty("locatorIdEmailTextbox"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();

	}

}
