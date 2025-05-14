package Selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpinningTarget {

WebDriver driver;
	
	@Test
	void setup() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	
		driver.get("https://www.uitestingplayground.com/animation");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("animationButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space(@class)='btn btn-primary']")));
		driver.findElement(By.xpath("//button[normalize-space(@class)='btn btn-primary']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='opstatus']")).getText());
		
		//button[normalize-space(@class)='btn btn-primary']
		
		
		
		
		
		
		
		
	}
	
	
}
