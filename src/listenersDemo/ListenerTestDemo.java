package listenersDemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class ListenerTestDemo {
	
	@Test
	public void TestOne()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void TestTwo()
	{
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="TestTwo")
	public void TestThird()
	{
		Assert.assertTrue(true);
	}

}
