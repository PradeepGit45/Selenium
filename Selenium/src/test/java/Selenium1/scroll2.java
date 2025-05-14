package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll2 {

WebDriver driver;
	
	@Test
	void setup() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	
		driver.get("https://www.uitestingplayground.com/scrollbars");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		
		
		new Actions(driver)
		.scrollToElement(driver.findElement(By.xpath("//button[@id='hidingButton']")))
		.perform();
	
		
		
//		driver.findElement(By.id("name")).sendKeys("Prad");
//		.sendKeys("Pradeep")
//		.build()
//		
//		.perform();
//		
	
		
		
		
		
		
		
		
	}

	
	
	
}
