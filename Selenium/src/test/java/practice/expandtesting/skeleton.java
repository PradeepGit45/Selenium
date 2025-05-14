package practice.expandtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class skeleton {

	
WebDriver driver;
	
	@Test 
	
	
	void setUp() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/radio-buttons");
		
	}
}
