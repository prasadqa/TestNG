package retryLogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
/*
 * Test level only 
 */
public class MyretryLogic implements IRetryAnalyzer{

	private int count = 0;
	private final int RETRY_LIMIT = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(count < RETRY_LIMIT)
		{
			count++;
			return true;
		}
		return false;
		
		//it works only test level it doesnt work runtime
		 /*if(result.getStatus()==ITestResult.FAILURE && count < RETRY_LIMIT)
		{
			count++;
			return true;
		}
		return false;
		 */
	}

}
