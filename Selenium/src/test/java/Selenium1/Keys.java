package Selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Keys {

	
	WebDriver driver;
	@Test
	void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		org.openqa.selenium.Keys cmdCtrl = org.openqa.selenium.Keys.CONTROL;
		 
		 
        WebElement textField = driver.findElement(By.id("textInput"));
        new Actions(driver)
                .sendKeys(textField, "Selenium!")
                .keyDown(org.openqa.selenium.Keys.SHIFT)
                .sendKeys(org.openqa.selenium.Keys.ARROW_LEFT)
                .sendKeys(org.openqa.selenium.Keys.ARROW_LEFT)
                .keyUp(org.openqa.selenium.Keys.SHIFT)
                .keyDown(cmdCtrl)
                .sendKeys("xvv")
                .perform();
                //.keyDown(org.openqa.selenium.Keys.SHIFT)
                
//                .sendKeys(org.openqa.selenium.Keys.ARROW_UP)
//                .keyUp(org.openqa.selenium.Keys.SHIFT)
//                .keyDown(cmdCtrl)
//                .sendKeys("xvv")
//                .keyUp(cmdCtrl)
        
        
	}
	
	
	
}
