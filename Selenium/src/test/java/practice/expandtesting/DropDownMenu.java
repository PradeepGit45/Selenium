package practice.expandtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMenu {

	
	
WebDriver driver;
	
	@Test 
	
	
	void setUp() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/form-validation");
		WebElement menu = driver.findElement(By.xpath("//select[@name = 'payment']"));
		
		Select sel = new Select(menu);
		sel.selectByIndex(1);
		
		String x = sel.getFirstSelectedOption().getText();;
		
		System.out.println(x);
	}
	
	
	
	
	
}
