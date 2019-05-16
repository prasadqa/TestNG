package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnGroups 
{
	@Test(dependsOnGroups={"Another"})
	public void aaaa()
	{
		Reporter.log("start");
		System.out.println("depends on sanity group");
		Reporter.log("End");
	
	}
}
