package automation_code_7th_feb_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_Objects_In_Automation {
	
	public static WebDriver driver;

	public static void main(String[] args) {
	
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		
		

	}

}
