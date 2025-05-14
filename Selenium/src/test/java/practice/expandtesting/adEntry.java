package practice.expandtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class adEntry {

	
WebDriver driver;
	
	@Test 
	
	
	void setUp() 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/entry-ad");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement abc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='close-modal-btn']")));
		abc.click();
		
	}
	
	
	
}







//button[@id='close-modal-btn']