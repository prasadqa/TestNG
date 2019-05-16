package testNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo 
{
	@BeforeMethod
	public void firsBeforeMethod()
	{
		System.out.println("Before method");
	}
	@Test(groups="Another")
	public void firsTestNg()
	{
		System.out.println("Test");
	}
	
}
