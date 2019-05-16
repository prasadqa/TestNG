package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterization {
	
	@Parameters("name")
	@Test
	public void testOne(@Optional("prasad")String param)
	{
		System.out.println(param);
	}
}
