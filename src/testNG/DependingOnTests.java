package testNG;

import org.testng.annotations.Test;

public class DependingOnTests {
	
	@Test(dependsOnMethods={"TestTwo","TestThree"})
	public void TestOne()
	{
		System.out.println("TestOne depending on TestTwo");
	}
	@Test
	public void TestTwo()
	{
		System.out.println("test two depends on test three");
	}
	@Test
	public void TestThree()
	{
		System.out.println("regression");
	}
	
}
