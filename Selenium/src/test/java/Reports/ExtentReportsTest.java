package Reports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportsTest {
	
	@Test
	void reportTest()
	{
		
			
			ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/report3.html");
			ExtentReports report = new ExtentReports();
			report.attachReporter(spark);
			
			ExtentTest test1 = report.createTest("Test 1"); //test1
			test1.log(Status.PASS, "1st parent test passed");
			ExtentTest subTest = test1.createNode("Sub Test 1");
			subTest.log(Status.PASS, "1st child test passed");
			
			
			ExtentTest test2 = report.createTest("Test 2");
			test2.log(Status.PASS, "2nd parent test passed");
			ExtentTest subTest2 = test2.createNode("Sub Test 2");
			subTest2.log(Status.PASS, "2nd child test passed");
		
		
		
		
		      report.flush();
		
		
	}

}
