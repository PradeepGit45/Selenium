package practice.expandtesting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InfiniteScroll {
	
WebDriver driver;
	
	@Test 
	
	
	void setUp() throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//https://practice.expandtesting.com/infinite-scroll (fails when scroll is too fast, but content doesn't load - assumes the content has finished) 
		//https://www.tutorialspoint.com/selenium/practice/horizontal-scroll.php  - limited scroll
		driver.get("https://practice.expandtesting.com/infinite-scroll");
		Thread.sleep(3000);
		long oldPosition = 1;
		JavascriptExecutor js =(JavascriptExecutor) driver;
		long scrollHeight = (long) 1001;
		
		long newPosition=0;
		
		for(int i=100; i<=scrollHeight; i= (int)scrollHeight, oldPosition = newPosition)
		{
			
			
				System.out.println("1:" + scrollHeight);
			scrollHeight = (long) js.executeScript("return document.body.scrollHeight;");
		
			new Actions(driver)
			
			
			.scrollByAmount(0, i)
			.perform();
			 Number NP = (Number) js.executeScript("return window.pageYOffset;");
			 newPosition = NP.longValue();
			 
			 if (newPosition != oldPosition)
				{
				continue;	
				}
			 else 
			 {
				 break;
			 }
		}
	}

}
