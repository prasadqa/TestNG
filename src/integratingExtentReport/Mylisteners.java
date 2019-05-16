package integratingExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Mylisteners extends TestDemo implements ITestListener{


	
	
	
	@Override
	public void onTestStart(ITestResult result) {
		
		test.info("test has been started");	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test case Passed", ExtentColor.GREEN));
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case failed", ExtentColor.RED));
		test.fail(result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test case Skipped", ExtentColor.BLUE));
		test.skip(result.getThrowable());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		test = generateExtentReport().createTest(getClass().getName()+"test start");
		
	}

	@Override
	public void onFinish(ITestContext context) {

		report.flush();
	}
	
	
	
}
