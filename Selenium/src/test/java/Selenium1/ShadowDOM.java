package Selenium1;

import static org.junit.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOM {
	
	
	
	
	
WebDriver driver;
	
	@Test
	void setup() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	
		driver.get("https://www.uitestingplayground.com/shadowdom");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		
		
		
		WebElement shadowHost = driver.findElement(By.tagName("guid-generator"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement inputField = (WebElement) js.executeScript("return arguments[0].shadowRoot.querySelector('#buttonGenerate')", shadowHost);
		inputField.click();
		WebElement value = (WebElement) js.executeScript("return arguments[0].shadowRoot.querySelector('#editField')", shadowHost);
		String text = (String)js.executeScript("return arguments[0].value;", value);
		System.out.println(text);
		
		WebElement copy = (WebElement) js.executeScript("return arguments[0].shadowRoot.querySelector('#buttonCopy')", shadowHost);
		copy.click();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		new Actions(driver)
		.keyDown(Keys.CONTROL)
		.sendKeys("v")
		.keyUp(Keys.CONTROL)
		.perform();
		

		
		
		String paste = driver.findElement(By.id("APjFqb")).getText();
		System.out.println("Paste:" + paste);
		
		Assertion check = new Assertion();
		check.assertEquals(paste, text);
		
		if(paste.equals(text))
		{
			System.out.println("Success");
		}
		
		
	
		
		
//		WebElement shadowHost =  driver.findElement(By.xpath("//guid-generator"));
//		  
//		SearchContext root = shadowHost.getShadowRoot();
//		
//		WebElement input = root.findElement(By.id("buttonGenerate"));
//		input.click();

		
		
		
		
		
	}

	
	

}
