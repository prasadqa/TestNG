package listenersDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenersDemo.CustomizeListeners.class)
public class zooplaTest extends TestBase{
	
	
	@BeforeMethod
	public void setUp()
	{
		initialize();
	}

	@Test
	public void TestOne()
	{
		Assert.assertTrue(false);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
