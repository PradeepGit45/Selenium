package practice.expandtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoComplete {
	
	
WebDriver driver;
	
	@Test 
	
	
	void setUp() throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/autocomplete");
		driver.findElement(By.id("country")).sendKeys("ind");
		Thread.sleep(3000);
	
		List<WebElement> menu = driver.findElements(By.xpath("//div[@id='countryautocomplete-list']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String text1 = driver.findElement(By.xpath("//div[@id= 'countryautocomplete-list']//div[1]//strong")).getText();
		//String text2 = driver.findElement(By.xpath("//div[@id= 'countryautocomplete-list']//div[1]//strong/following-sibling::text()[1]"));
		
		System.out.println(text1 + "   " );
		
		
		for(WebElement e : menu)
			
			
			
		{
			
			String country = (String) js.executeScript("return document.querySelector('input[type=hidden]').value;");
			if (country.equals("India"))
			{
				System.out.println("Inside");
				e.click();
			}
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			String value = (String) js.executeScript("return document.querySelector('input[type=hidden]').value;");
//			System.out.println("Value from hidden input: " + value);
//
//			//div[@id= 'countryautocomplete-list']//div[1]//strong
			//div[@id= 'countryautocomplete-list']//div[1]//strong/following-sibling::text()[1]
//
//			if (value.equals("India")) {
//			    System.out.println("Match found!");
//			    e.click();
				
				
//			}
		}
		
		
		
		
	}

}
