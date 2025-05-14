package practice.expandtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	WebDriver driver;
	
	@Test 
	
	
	void setUp() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/radio-buttons");
		new Actions(driver)
		.scrollByAmount(0, 1233)
		.perform();
		Thread.sleep(3000);
		WebElement blue = driver.findElement(By.xpath("//input[@id='blue']"));
		WebElement red = driver.findElement(By.xpath("//input[@id='red']"));
		WebElement yellow = driver.findElement(By.xpath("//input[@id='yellow']"));
		WebElement black = driver.findElement(By.xpath("//input[@id='black']"));
		WebElement green = driver.findElement(By.xpath("//input[@id='green']"));
		
		blue.click();
		red.click();
		yellow.click();
		black.click();
		try {
			green.click();
		}
		
		catch (Exception e)
		{
			if (!green.isEnabled())
			{
				System.out.println("Green is not enabled");
			}
			
		}
		
		
		
	}
	
	
}
