package practice.expandtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragndropCircle {

	
WebDriver driver;
	
	@Test 
	
	
	void setUp() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
		
		WebElement red = driver.findElement(By.xpath("//div[@class='red']"));
		WebElement green = driver.findElement(By.xpath("//div[@class='green']"));
		WebElement blue = driver.findElement(By.xpath("//div[@class='blue']"));
		
		WebElement target= driver.findElement(By.id("target"));
		
		
		new Actions(driver)
		.scrollByAmount(0, 1095)
		.dragAndDrop(red, target)
		.dragAndDrop(green, target)
		.perform();
		
		Thread.sleep(3000);
		new Actions(driver)
		.dragAndDrop(blue, target)
		.perform();
				
		
		
		
	}
	
	
}
