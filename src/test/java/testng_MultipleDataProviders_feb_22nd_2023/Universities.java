package testng_MultipleDataProviders_feb_22nd_2023;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Universities {

	public static WebDriver driver;
	public static SoftAssert softassert = new SoftAssert();
	public static WebDriverWait wait;

	@Test(priority = 1, dataProvider = "ninjaDataSupply", dataProviderClass = DataProviderDataSupply.class)
	public static void ninjaTest(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		softassert.assertAll();
		driver.quit();

	}
	
	@Test(priority = 2, dataProvider = "rediffDataSupply",dataProviderClass = DataProviderDataSupply.class )
	public static void rediffTest(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		WebElement logoutLink = driver.findElement(By.cssSelector("a.rd_logout"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		softassert.assertTrue(driver.findElement(By.cssSelector("a.rd_logout")).isDisplayed());
		
		softassert.assertAll();
		driver.quit();

	}
}
