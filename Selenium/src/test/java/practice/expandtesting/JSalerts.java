package practice.expandtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSalerts {

	
	
WebDriver driver;
	
	@Test 
	
	
	void setUp() throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/js-dialogs");
		driver.findElement(By.id("js-prompt")).click();

		Alert alert = driver.switchTo().alert(); 
//		alert.wait(3000);
		alert.sendKeys("Hellofwef");
		Thread.sleep(3000);
		alert.accept();
		
		
	}
}
