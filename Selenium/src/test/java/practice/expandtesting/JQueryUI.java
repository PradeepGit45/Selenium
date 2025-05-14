package practice.expandtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryUI {

WebDriver driver;
	
	@Test 
	
	
	void setUp() throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/jqueryui");
		
		String url = driver.findElement(By.xpath("//a[text() = 'Menu']")).getAttribute("href");
		driver.get(url);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		Actions ref = new Actions(driver);
//		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id= 'ui-id-2']")));
        
		WebElement menu1 = driver.findElement(By.xpath("//a[@id= 'ui-id-2']"));
		ref.moveToElement(menu1)
        .perform();
	
//		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id= 'ui-id-4']")));
		WebElement menu2 = driver.findElement(By.xpath("//a[@id= 'ui-id-4']"));
		
		ref.moveToElement(menu2).perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id= 'ui-id-6']")));
		WebElement menu3 = driver.findElement(By.xpath("//a[@id= 'ui-id-6']"));
		
		ref.moveToElement(menu3) 
		.click()
		.perform();
		
	

        // Hover over "ui-id-2" (Parent Menu)
//        WebElement menu1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-2")));
//        ref.moveToElement(menu1).perform();  
//
//        // Hover over "ui-id-4" (Submenu)
//        WebElement menu2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-4")));
//        ref.moveToElement(menu2).perform();
//
//        // Click "ui-id-6" (Final Menu Item)
//        WebElement menu3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-id-6")));
//        menu3.click();  // No need for Actions click
		
		
	}
		
	
}
