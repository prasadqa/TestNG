package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsONDemo {

	@Test(priority = 1)
	public void lunchApp()
	{
		System.out.println("app has been opened");
	}
	@Test(priority = 2,dependsOnMethods="lunchApp")
	public void login()
	{
		Assert.assertTrue(false);
	}
	@Test(priority = 3,dependsOnMethods={"lunchApp","login"})
	public void logOut()
	{
		System.out.println("log out");
	}
	

	
	
}
