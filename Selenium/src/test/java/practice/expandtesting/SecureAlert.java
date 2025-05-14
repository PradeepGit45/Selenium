package practice.expandtesting;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecureAlert {

	
WebDriver driver;
	
	@Test 
	
	
	void setUp() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/download-secure");
		Thread.sleep(3000);
		
		Object[] windowHandles = driver.getWindowHandles().toArray();
		System.out.println(windowHandles[0] + "  "  );
		driver.switchTo().window((String)windowHandles[1]);
//		Alert alert = driver.switchTo().alert();
//		String text1 = alert.getText(); 
//		System.out.println(text1);
//		assertEquals(text1, "Username");
//		alert.send
		
	}
	
	
}
