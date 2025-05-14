package Selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {

WebDriver driver;
	
	@Test
	void setup() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	
		driver.get("https://www.uitestingplayground.com/overlapped");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
//		new Actions(driver)
//		.scrollToElement(driver.findElement(By.id("id")))
	
//		new Actions(driver)
//		.scrollToElement(driver.findElement(By.xpath("//input[@id='name']")))
//		.perform();
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Prad");
//		.sendKeys("Pradeep")
//		.build()
//		
//		.perform();
//		
		
		
		
		
		
		
	}

}

	
	

