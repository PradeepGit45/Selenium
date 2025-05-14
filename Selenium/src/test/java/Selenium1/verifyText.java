package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyText {

	

	WebDriver driver;
	@Test
	void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		String a="";
		driver.get("https://www.uitestingplayground.com/verifytext");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		String out = driver.findElement(By.xpath("//span[normalize-space()='Welcome UserName!']")).getText();
		
		System.out.println(out);
		
		
		
		
		
		
	}
}
