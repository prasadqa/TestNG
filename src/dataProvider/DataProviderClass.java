package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "Data-Provider")
	public static Object[][] dataProvider()
	{
		return new Object[][]{{"prasad","india"},{"challa","hyderabad"}};
	}
	
}
