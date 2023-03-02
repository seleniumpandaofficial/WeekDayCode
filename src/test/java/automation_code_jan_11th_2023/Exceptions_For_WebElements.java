package automation_code_jan_11th_2023;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceptions_For_WebElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); //Ctrl + Shift + O
		driver.manage().window().maximize(); //method chaining
		driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	    driver.get("https://rediff.com");
	    //driver.findElement(By.className("bmailicon relative")).click();

	}

}
