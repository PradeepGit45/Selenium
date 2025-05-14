package practice.expandtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMenuViaXpath {

	
	
WebDriver driver;
	
	@Test 
	
	
	void setUp() 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		
		driver.findElement(By.xpath("//option[@value= '2']")).click();
		
		driver.findElement(By.xpath("//option[@value='IN']")).click();
		
		
		
		
	}
}
