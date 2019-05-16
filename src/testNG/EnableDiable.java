package testNG;

import org.testng.annotations.Test;

public class EnableDiable {
	
	@Test(enabled=false)
	public void TestNg1() {
		System.out.println("Test priority 3");
	}
	@Test
	public void TestNg2() {
		System.out.println("Test priority 3");
	}
	@Test
	public void TestNg3() {
		System.out.println("Test priority 3");
	}
}
