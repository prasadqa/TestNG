package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleSetOfData {
	
	@Test(dataProvider = "MultipleSetDataProvider")
	public void TestOne(String name,String email,String location)
	{
		System.out.println(name);
		System.out.println(email);
		System.out.println(location);
	}
	@DataProvider(name = "MultipleSetDataProvider")
	public Object[][] data()
	{
		Object[][] data =  new Object[2][3];
		data[0][0]= "prasad";
		data[0][1]= "prasad@gmail.com";
		data[0][2]= "hyderabad";
		data[1][0]="challa";
		data[1][1]= "challa@gmail.com";
		data[1][2]= "Nizamabad";
		return data;
	}

}
