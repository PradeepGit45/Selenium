package practice.expandtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDrop {

WebDriver driver;
	
	@Test 
	
	
	void setUp() 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/drag-and-drop");
		
		WebElement A = driver.findElement(By.id("column-a"));
		WebElement B = driver.findElement(By.id("column-b"));
		
		String a = A.getText();
		String b = B.getText();
		
		System.out.println("A:" + "  " + a);
		System.out.println("B:"+ "  " + b);
		
		System.out.println("---------");
		
		
		new Actions(driver)
		.scrollByAmount(0, 1233)
		.dragAndDrop( A   , B )
		.dragAndDropBy(B, -150, 0)
		
		.perform();
		
		 a = A.getText();
		 b = B.getText();
		 
		 System.out.println("A:"+"  " + a);
			System.out.println("B:" + "  " + b);
		 
	}
	
	
	
	
	
}
