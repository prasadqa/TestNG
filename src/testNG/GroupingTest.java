package testNG;

import org.testng.annotations.Test;

public class GroupingTest {
	
	@Test(groups={"sanity","EndToEnd"})
	public void TestOne()
	{
		System.out.println("sanity");
	}
	@Test(groups={"sanity","EndToEnd"})
	public void TestTwo()
	{
		System.out.println("sanity");
	}
	@Test(groups={"Regression","EndToEnd"})
	public void TestThree()
	{
		System.out.println("regression");
	}
	@Test(groups={"Regression","EndToEnd"})
	public void TestFour()
	{
		System.out.println("Regression");
	}
	@Test(groups={"Smoke",})
	public void TestFive()
	{
		System.out.println("smoke");
	}

}
