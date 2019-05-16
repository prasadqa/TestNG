package testNG;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test(priority = 1,description="priority is works smaller value to bugger value")
	public void TestNg1()
	{
		System.out.println("Test priority 1");
	}
	@Test(priority = 2)
	public void TestNg2()
	{
		System.out.println("Test priority 2");
	}
	@Test(priority = 3)
	public void TestNg3()
	{
		System.out.println("Test priority 3");
	}
	@Test(priority = -1,description = "priority accepts nagtive values also")
	public void TestNg4()
	{
		System.out.println("Test priority 4");
	}

}
