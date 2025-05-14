package Selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgressBar {
	
	
	
	WebDriver driver;
	
	@Test
	void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		String a="";
		driver.get("https://www.uitestingplayground.com/progressbar");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("startButton")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-valuenow='75']")));
		
		driver.findElement(By.id("stopButton")).click();
		WebElement element = driver.findElement(By.id("progressBar"));
		String ele = element.getAttribute("aria-valuenow"); 
		System.out.println(ele);
		
		
		
		
		
		
		
		
	}

}
