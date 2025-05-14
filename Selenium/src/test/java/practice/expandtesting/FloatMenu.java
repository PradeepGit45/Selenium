package practice.expandtesting;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FloatMenu {

	
	
WebDriver driver;
	
	@Test 
	
	
	void setUp() 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/floating-menu");
		WebElement menu = driver.findElement(By.xpath("//button[normalize-space(@class)='btn btn-primary mb-2'] "));
		org.openqa.selenium.Point Oldposition = menu.getLocation();
		new Actions(driver)
		.scrollByAmount(0, 5267)
		.perform();
		
		
		
		String text =menu.getText();
		if(menu.isDisplayed())
		{
			System.out.println("Menu is visible after scrolling");
			
		}
		
		org.openqa.selenium.Point Newposition = menu.getLocation();
		
		if (Newposition.equals(Oldposition))
		{
			System.out.println("Location is same");
		}
		else 
		{
			System.out.println("error");
			System.out.println(Newposition + "  "  + Oldposition);
		}
	}
	
	
}
