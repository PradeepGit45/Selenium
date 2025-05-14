package practice.expandtesting;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileUpload {

WebDriver driver;
	
	@Test 
	
	
	void setUp() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload");
		
		File uploadFile = new File("src/test/resources/dummy.docx");
		WebElement fileInput = driver.findElement(By.id("fileInput"));
		
		  fileInput.sendKeys(uploadFile.getAbsolutePath());
		    driver.findElement(By.id("fileSubmit")).click();
		
	}
	
	
}
