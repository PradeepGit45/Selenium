package practice.expandtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrames {

	
	
	
	
	
	
WebDriver driver;
	

     @FindBy(id="mce_0_ifr")
          WebElement x; 


	@Test 
	
	
	void setUp() 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/iframe");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement iFrame1 = driver.findElement(By.id("iframe-youtube")); 
		
		
		WebElement iFrame2 = driver.findElement(By.id("mce_0_ifr")); 
		WebElement iFrame3 = driver.findElement(By.id("email-subscribe")); 
		
		driver.switchTo().frame(iFrame1);
		
		String youTube =driver.findElement(By.xpath("//a[text() = 'Cypress in a Nutshell - 2019']")).getAttribute("href");
		System.out.println("Frame 1:" + "   " + youTube );
		System.out.println("before error1");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(iFrame2);
		System.out.println("After error1");
//		driver.findElement(By.xpath(" //button[normalize-space(@class)='tox-notification__dismiss tox-button tox-button--naked tox-button--icon'] ")).click();
//		driver.findElement(By.xpath("//span[@aria-label= 'Close']")).click();
		System.out.println("before error");
		String content =driver.findElement(By.xpath("//body[@id='tinymce']")).getText();
		System.out.println("After error");
		System.out.println(content);
		
		
		//input[@type='email']
		driver.switchTo().defaultContent();
		driver.switchTo().frame(iFrame3);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test1@test.com"); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));
		
		WebElement sub = driver.findElement(By.id("btn-subscribe"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		js.executeScript("arguments[0].scrollIntoView(true);", sub);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("\"btn-subscribe")));
		sub.click();
		
		
//		try
//		{
//			sub.click();
//		}
//		catch(ElementClickInterceptedException e)
//		{
//			
			new Actions(driver)
			.scrollToElement(sub)
			.perform();
            sub.click();
//		}
//		
		
	
		
		
	}
}
