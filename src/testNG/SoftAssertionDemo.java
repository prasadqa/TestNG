package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {

	@Test(priority=1,description="demo on soft assert equals")
	public void softEquals()
	{
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(false, true,"mismatch");
		System.out.println("fails");
		softAssert.assertEquals("pass", "pass","must be pass");
		System.out.println("pass");
		softAssert.assertAll();
		
				
	}
	@Test(priority=2,description="demo on hard assert equals")
	public void hardEquals()
	{
		System.out.println("test hard assert");
		Assert.assertEquals("pass", "fail");
		System.out.println("not executed");
				
	}

	
	
	
}
