package integratingExtentReport;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NormalTestNG {

	public static ExtentReports report;
	public static ExtentTest logger;
	
	@BeforeTest
	public void setUp()
	{
		Calendar calendar = Calendar.getInstance();
		Date time = calendar.getTime();
		SimpleDateFormat date = new SimpleDateFormat("YYYY_MM_dd_hh_mm_ss");
		String name = date.format(time);
		System.out.println(name);
		 report = new ExtentReports(System.getProperty("user.dir")+"\\sampelReport"+name+".html");
	}
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE) 
		{
			logger.log(LogStatus.FAIL, result.getMethod().getMethodName()+" Test case fail");
		
		}
		else if (result.getStatus()==ITestResult.SUCCESS) {
			logger.log(LogStatus.PASS, result.getMethod().getMethodName()+" test case pass");
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			logger.log(LogStatus.SKIP, result.getMethod().getMethodName()+" test case skipped");

		}
		
		report.endTest(logger);
		
	}
	@Test()
	public void TestOne()
	{
		logger = report.startTest("TestOne");
		Assert.assertTrue(true);
		
	}
	@Test()
	public void TestTwo()
	{
		logger = report.startTest("TestTwo");
		Assert.assertTrue(false);
		
	}
	@Test()
	public void TestThree()
	{
		logger = report.startTest("TestThree");
		throw new SkipException("not ready to execute");
		
	}
	@AfterTest
	public void tearDown()
	{
		report.flush();
	}
}
