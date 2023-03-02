package automation_code_feb_21st_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows_Tabs {
	public static WebDriver driver;
	
	@Test(priority = 1)
	public void openTabs() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http:tutorialsninja.com/demo");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://amazon.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		driver.navigate().back();
		driver.quit();
	}
	
	@Test (priority = 2)
	public void openWindows() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http:tutorialsninja.com/demo");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://amazon.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		
		driver.quit();
	}

}
