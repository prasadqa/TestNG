package testNG;

import org.testng.annotations.Test;

public class TestNGExceptions {

	@Test(expectedExceptions={java.lang.ArithmeticException.class})
	public void testOne()
	{
		int n = 1/0;
		System.out.println(n);
	}
}
