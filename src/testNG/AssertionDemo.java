package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo 
{
	@Test(priority=1,description="demo on assert equals")
	public void Equals()
	{
		Assert.assertEquals(12, 13);
		//if both actual and expected are equal then test case pass
	}
	
	@Test(priority=2,description="demo on assert true")
	public void assetTruedDemo()
	{
		Assert.assertTrue(true);
		//if given condition must be true otherwise test case fails
	}
	@Test(priority=3,description="demo on assert true")
	public void assetTruedDemo1()
	{
		Assert.assertTrue(false);
		//if given condition must be true otherwise test case fails
	}
	@Test(priority=4,description="demo on assert false")
	public void assetFalseDemo1()
	{
		Assert.assertFalse(true);
		//if given condition must be false otherwise test case fails
	}
	@Test(priority=5,description="demo on assert false")
	public void assetFalseDemo2()
	{
		Assert.assertFalse(false);
		//if given condition must be false otherwise test case fails
	}
	
	
	
}
