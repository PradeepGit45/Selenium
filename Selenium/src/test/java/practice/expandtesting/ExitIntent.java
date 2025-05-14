package practice.expandtesting;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExitIntent {

	
WebDriver driver;
	
	@Test 
	
	
	void setUp() 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/exit-intent");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//p[normalize-space(@class)='text-center X-border X-border-1 coffee-border px-2 py-2']")).click();
		WebElement a = driver.findElement(By.xpath("//h1"));
		new Actions(driver)
		.moveToElement(a)
		.perform();
	
		
		
	}
	

	
}

