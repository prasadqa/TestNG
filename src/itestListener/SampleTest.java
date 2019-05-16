package itestListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void testOne()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void testOne1()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void testOne2()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void testTwo1()
	{
		Assert.assertTrue(false);
	}
	@Test
	public void testTwo2()
	{
		Assert.assertTrue(false);
	}
	@Test
	public void testTwo()
	{
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="testTwo")
	public void testThree()
	{
		Assert.assertTrue(false);
	}
}
