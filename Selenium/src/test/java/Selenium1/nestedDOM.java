package Selenium1;

import org.junit.runner.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nestedDOM {
	
	WebDriver driver;
	
	@Test
	void setup() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/large");
		String a = driver.findElement(By.xpath("//td[@class='column-50' and text()='50.50']")).getText();
		System.out.println(a);
		
		String ab = driver.findElement(By.xpath("//div[@id = 'sibling-7.1']/following-sibling::text()[1]")).getText();
		System.out.println();
		
   
				//div[@id = 'sibling-7.1']/following-sibling::text()[1]
	}

	
	

}

