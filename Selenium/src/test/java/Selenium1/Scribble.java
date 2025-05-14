package Selenium1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scribble {
	
	
	
	WebDriver driver;
	
	@BeforeTest()
	
	void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	@Ignore
	@Test 
	void fun() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.get("https://www.testautomationcentral.com/demo/dropdown.html");
//		driver.get("https://www.imdb.com/chart/top/?ref_=nv_mv_250");
//		driver.getTitle();
//		driver.getCurrentUrl();
//		//refresh
//		driver.navigate().forward();
//		driver.navigate().back();
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.google.com");
//		//driver.close(); //closes current tab
//		driver.quit(); //closes browser
//		List<WebElement> list = driver.findElements(By.tagName("h1"));
//		WebElement el= list.get(0);
//		list.get(0).isDisplayed();
//		el.click();
//		el.sendKeys("xyz");
//		el.clear();
//		el.getText();
//		el.getAttribute("href");
//		driver.findElement(By.xpath("//button[contains(text(), 'Multi')]")).click();
//		WebElement ele = driver.findElement(By.xpath("//select[@multiple]//option[text() = 'Option 4']"));
//		WebElement ele1 = driver.findElement(By.xpath("//select[@multiple]//option[text() = 'Option 5']"));
//		new Actions(driver)
//		.keyDown(Keys.CONTROL)
//		.click(ele)
//		.click(ele1)
//		.release()
//		.build()
//		.perform();  // is it better to use xpath that Select class? Differences? 
//		
//		new Actions(driver)
//		.moveToElement(ele1)
//		.perform();
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(null));
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().sendKeys("");
//	    WebElement frame =	driver.findElements(By.tagName("iframe")).get(0);
//		driver.switchTo().frame(frame);
//		driver.switchTo().defaultContent();
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		Set <String> windows =driver.getWindowHandles();
//		System.out.println(windows);
//		String[] windowss = new String[2];
//		int i =0;
		
//		Iterator<String> windowValue = windows.iterator();
		
		
//		for (String string : windows) {
//			
//			
//			windowss[i]= string; //default window acts as 0th. New window acts as 1st. 
//			i++;
//			
//			
//		}
//		System.out.println(windowss);
//		driver.switchTo().window(windowss[0]);
//		Thread.sleep(2000);
//		driver.get("https://www.google.com");
//		driver.close();
//		driver.switchTo().window(windowss[1]);
//		driver.get("https://www.facebook.com");
//		
//
//		
//		new Actions(driver)
//		.dragAndDrop(null, null)
//		.perform();
		
		driver.get("https://practice.expandtesting.com/upload");  // upload
//		File file = new File("C:\\Users\\sprad\\eclipse-workspace-2\\Selenium\\src\\test\\resources\\dummy.docx");
//		System.out.println(file.getAbsolutePath());
		driver.findElement(By.name("file")).sendKeys("C:\\Users\\sprad\\eclipse-workspace-2\\Selenium\\src\\test\\resources\\dummy.docx");
		driver.findElement(By.id("fileSubmit")).click();
		
		
		
	}
	
	@Ignore
	@Test()

	
void download() throws InterruptedException
{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/download");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement fileTxt = driver.findElement(By.xpath("//a[contains(@data-testid, 'some-file.txt')] "));
		try
		{
			
			fileTxt.click();
		}
		catch (ElementClickInterceptedException e)
		{
			
			js.executeScript("arguments[0].scrollIntoView(true)" , fileTxt );
//			Thread.sleep(4000);
			System.out.println("Inside catch");
			if (fileTxt.isDisplayed())
			{
				System.out.println("Displayed");
			}
			else
			{
				System.out.println("Not displayed");
			}
			fileTxt.click();
			
		}
		
		File file = new File("C:\\Users\\sprad\\Downloads\\some-file.txt");
		if(file.exists())
		{
			System.out.println("Downloaded");
			
		}
		else 
		{
			System.out.println("Failed");
		}
		
		
}	
		@Test
		
		void table() throws IOException

		{
			driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
			driver.findElement(By.xpath("//option[text() = 'All']")).click();
			List <WebElement> elements = driver.findElements(By.xpath("//tbody//tr"));
			System.out.println(elements.size()); 
			
			TakesScreenshot ss = (TakesScreenshot) driver;
			File fileSS = new File("C:\\Users\\sprad\\eclipse-workspace-2\\Selenium\\src\\test\\resources\\screenshot.png");
			File sss= ss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFileToDirectory(sss, fileSS);
			
			
			
		}
		
		
		
		
		

	
	
	
}
