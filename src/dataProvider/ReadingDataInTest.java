package dataProvider;

import org.testng.annotations.Test;

public class ReadingDataInTest {

	@Test(dataProvider="Data-Provider",dataProviderClass=DataProviderClass.class)
	public void TestOne(String name,String location)
	{
		System.out.println(name);
	}
}
