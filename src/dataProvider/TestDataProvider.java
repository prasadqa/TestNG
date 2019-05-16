package dataProvider;

import org.testng.annotations.Test;

public class TestDataProvider {

	@Test(dataProvider="userData",dataProviderClass=ExcelDateToDataProvider.class)
	public void TestOne(String userName,String password,String email)
	{
		System.out.println(userName+"****"+password+"****"+email);
	}
	
}
