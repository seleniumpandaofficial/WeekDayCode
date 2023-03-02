package automation_code_jan_10th_2023;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Browser_Code {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://cnn.com");
	    driver.quit();
	    
	    WebDriver driver1 = new FirefoxDriver();
	    driver1.manage().window().maximize();
	    driver1.manage().deleteAllCookies();
	    driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver1.get("https://rediff.com");
	    driver1.quit();
	    
	    WebDriver driver2 = new EdgeDriver();
	    driver2.manage().window().maximize();
	    driver2.manage().deleteAllCookies();
	    driver2.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver2.get("https://walmart.com");
	    driver2.quit();
	    

	}

}
