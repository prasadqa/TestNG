package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSameClass {
	
	@Test(dataProvider = "dataProviderInsSameClass")
	public void TestOne(String name)
	{
		System.out.println(name);
	}
	@DataProvider(name = "dataProviderInsSameClass")
	public Object[][] data()
	{
		Object[][] data =  new Object[2][];
		data[0] = new Object[1];
		data[1] = new Object[1];
		data[0][0]= "prasad";
		data[1][0]="challa";
		return data;
	}

}
