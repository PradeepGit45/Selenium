package Selenium1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice2 {

	WebDriver driver;
	@Test
	void setup()
	{
		
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		driver.findElement(By.id("newWindowBtn")).click();
//		
//		Object[] handles = driver.getWindowHandles().toArray();
//		String handle1 = (String)handles[0];
//		String  handle2= (String)handles[1];
//		

//	    String title = driver.switchTo().window(handle2).getTitle();
//	    driver.close();
//	    
//	    System.out.println(title);
	    
//	    driver.findElement(By.id("newTabBtn")).click();
//	    Object[] handles = driver.getWindowHandles().toArray();
//		String handle1 = (String)handles[0];
//		String  handle2= (String)handles[1];
//		
//
//	    String title = driver.switchTo().window(handle2).getTitle();
//	    System.out.println(title);
//	    
//	    driver.findElement(By.id("alertBox")).click();
//	    driver.switchTo().alert().accept();
//	    driver.close();
//	    
//	    String title2 = driver.switchTo().window(handle1).getTitle();
//	    System.out.println(title2);
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.switchTo().newWindow(WindowType.TAB);
	}
}
