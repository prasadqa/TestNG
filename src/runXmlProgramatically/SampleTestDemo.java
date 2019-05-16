package runXmlProgramatically;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestDemo 
{
	@BeforeMethod
	public void setUp()
	{
		System.out.println("befor method");
	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("after method");
	}
	@Test
	public void TestOne1()
	{
		System.out.println("create Multiple xml file programatically in: "+getClass().getName());
	}
}
