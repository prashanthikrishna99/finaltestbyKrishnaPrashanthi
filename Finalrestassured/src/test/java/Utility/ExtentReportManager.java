package Utility;

import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportManager {
	
	public static ExtentReports extentReport;
	public static ExtentTest extentTest;
	
	public static void CreateReport(String reportName) {
		Date date=new Date();
		String time=date.getTime()+"";
		extentReport=new ExtentReports(System.getProperty("user.dir")+"/target/data-out/"+reportName+"_"+time+".html");
		
	}
	public static void StartTest(String testName) {
		extentTest = extentReport.startTest(testName);
	}

}
