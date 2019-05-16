package itestListener;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;


public class IreporterListener implements IReporter{

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		for (ISuite suite : suites)
		{
			String suiteName = suite.getName();
			Map<String, ISuiteResult> suiteResult = suite.getResults();
			for (ISuiteResult sr : suiteResult.values()) 
			{
				ITestContext tc = sr.getTestContext();
				System.out.println("All passed test '"+suiteName+"' is :"+tc.getPassedTests().getAllResults().size());
				System.out.println("All falied test '"+suiteName+"' is :"+tc.getFailedTests().getAllResults().size());
				System.out.println("All passed test '"+suiteName+"' is :"+tc.getSkippedTests().getAllResults().size());
			}
		}
		
	}

}
