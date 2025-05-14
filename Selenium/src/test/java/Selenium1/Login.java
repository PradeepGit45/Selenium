package Selenium1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	
WebDriver driver;
	

	
	@FindBy (id ="details-button" )
	WebElement ID;
	
	public void fun()
	{
		ID.click();
	}

	@Test(successPercentage = 50)
	void setup()
	{
		
		DateFormat dateFr = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date = new Date();
		
		
		
		System.out.println(dateFr.format(date));
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		
		
		driver.get("https://www.uitestingplayground.com/sampleapp");
		
		PageFactory.initElements(driver, this);
		fun();
	
		driver.findElement(By.id("proceed-link")).click();
		
		
		
		driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("pwd");
		driver.findElement(By.id("login")).click();
		
		WebElement welcomeTxt = driver.findElement(By.xpath("//label[contains(text(), 'Welcome')]"));
		System.out.println(welcomeTxt);
		System.out.println(welcomeTxt.getText());
		String section = driver.findElement(By.xpath("//section")).getText();
		
		String section2[] = new String[]
				{   
					"Sample", 	
					"Fill",
					"Log",
					"Welcome"
						
						
				};
		
		int size = section2.length;
		System.out.println("size: " + size);
		
	 int count = 0 ;
	for(int i=0; i<4; i++)
	{
		
		if (section.contains(section2[i])  )
		{
			count++;
		}
		
		
		
	}
	
		double percentage = (count /size)* 100;
		System.out.println(percentage + "%");
		System.out.println("Count:  " + count);
		
		
		
		
		
	}


}
