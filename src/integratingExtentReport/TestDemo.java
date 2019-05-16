package integratingExtentReport;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestDemo extends TestBase{
	
	
		
	
	
	@Test
	public void testOne()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void testTwo()
	{
		Assert.assertTrue(false);
	}
	@Test
	public void testThree()
	{
		
		throw new SkipException("skipped");
	}
	
	
	
}
