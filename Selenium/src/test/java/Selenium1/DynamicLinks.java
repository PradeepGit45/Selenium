package Selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicLinks {

WebDriver driver;
	
	@Test
	void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		String a="";
		driver.get("https://www.uitestingplayground.com/mouseover");
		
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		
		for(int i=1; i<20; i++)
			{
			driver.findElement(By.xpath("//a[text()='Click me']")).click();
			driver.findElement(By.xpath("//a[text()='Link Button']")).click();
			
			}
		
		System.out.println(driver.findElement(By.id("clickCount")).getText());
		System.out.println(driver.findElement(By.id("clickButtonCount")).getText());
		
		
		
		
		
		
	}

	
	
}





