package integratingExtentReport;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.xerces.util.SynchronizedSymbolTable;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestBase {
	
	private static ExtentHtmlReporter extent;
	public static ExtentReports report;
	public static ExtentTest test;
	private static String pathOfReport = System.getProperty("user.dir")+"//ExtentReports//Automation"; 
	public static ExtentReports generateExtentReport()
	{
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY_MM_dd_hh_mm_ss");
		String file = sdf.format(time);
		extent = new ExtentHtmlReporter(pathOfReport+" "+file+".html");
		System.out.println(pathOfReport+" "+file+".html");
		extent.config().setDocumentTitle("NameOfTheProject");
		extent.config().setReportName("NameOfTheTestModule");
		extent.config().setTestViewChartLocation(ChartLocation.TOP);
		extent.config().setTheme(Theme.DARK);
		
		report = new ExtentReports();
		report.attachReporter(extent);
		
		report.setSystemInfo("OS", "Windows");
		report.setSystemInfo("HostName", "Prasad");
		report.setSystemInfo("Environmet", "QA");
		report.setSystemInfo("UserName", "Prasad Challa");
		
		return report;
	}

}
