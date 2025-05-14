package practice.expandtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {

	
WebDriver driver;
	
	@Test 
	
	
	void setUp() 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/horizontal-slider");
//		driver.findElement(By.xpath("//input[@type='range']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("//input[@type='range']")));
//		Thread.sleep(2000);
		
		
		
		String range = "0";
	  while(!(range.equals("4.5")))
	  {
		  
		     
		     act.moveByOffset((int) 0.5, 0)
		     .perform();
//			.sendKeys(Keys.ARROW_RIGHT)
//			.perform();
		 WebElement rangee = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='range' ]")));
			range = rangee.getText();
		  System.out.println(range);
		  act.moveByOffset((int) 1, 0)
		  .perform();
	  }
	   System.out.println("The value of range is: " + range);
	   
	   
	}
}
