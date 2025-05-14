package Selenium1;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paginationTable {

	WebDriver driver;
	@Test
	void setup() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = driver.findElement(By.xpath("//a[@data-dt-idx= '1']"));
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
//		element.click();
		Thread.sleep(3000);
	     
		driver.switchTo().frame("google_esf");
		
		driver.findElement(By.xpath("//iframe[@id= 'google_esf']")).click();
		
		
		
//		Actions actions = new Actions(driver);
//		WebElement element = driver.findElement(By.xpath("//a[@data-dt-idx= '1']"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
		// Scroll until the element is visible and clickable
//		actions.scrollToElement(element).perform();
		
		
	
		

		// Wait until clickable
	
		
//		driver.findElement(By.xpath("//a[@data-dt-idx= '1']")).click();
		
		
		
		
		
	}
	
	
	
	
}
