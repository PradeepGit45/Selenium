package practice.expandtesting;

import java.net.HttpURLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;


public class BrokenImage {

WebDriver driver;
	
	@Test 
	
	
	void setUp() 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/broken-images");
		String window = driver.getWindowHandle();
		
//		String src = driver.findElement(By.xpath("//img[@alt=\"Image 3\"]")).getAttribute("src");
//		
//		System.out.println(src);
		
		
		List <WebElement> imgs = driver.findElements(By.tagName("img")); 
		
		for(WebElement images : imgs)
		{
			String src = images.getAttribute("src");
			try 
			   { 
				HttpURLConnection connection = (HttpURLConnection) new URL(src).openConnection();
                connection.setRequestMethod("HEAD");
                
                connection.connect();
                int responseCode = connection.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println("Broken Image: " + src + " (Status: " + responseCode + ")");
                } else {
                    System.out.println("Image is good: " + src);
                }

                connection.disconnect();
            
//				  driver.get(src);
//				  System.out.println("No error - Image is good");
//				  driver.get("https://practice.expandtesting.com/broken-images");
//				  
			   }
		catch (IOException e) {
            System.out.println("Error checking image: " + src);
		}
			
		}
		
	   

		
	}
	
	
}
