package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGTimeOut {

	@Test
	public void TestOne() throws Throwable
	{
		Reporter.log("Start Test");
		Thread.sleep(2000);
		Reporter.log("End Test");
	}
	@Test(timeOut=1000)
	public void TestTwo() throws Throwable
	{
		Thread.sleep(2000);
	}
}
