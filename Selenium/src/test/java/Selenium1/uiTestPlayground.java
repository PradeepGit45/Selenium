package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uiTestPlayground {

	
	

	WebDriver driver;
	@Test
	void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		String a="";
		driver.get("https://www.uitestingplayground.com/dynamictable");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		String out = driver.findElement(By.xpath("//span[normalize-space()='Chrome']//following-sibling::*[contains(text(), '%')]")).getText();
		
		System.out.println(out);
		
		
		
		
		
		
	}
	
	
	
	
}
