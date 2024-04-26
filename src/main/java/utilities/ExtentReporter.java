package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	
	static ExtentReports extentReport;
	public static ExtentReports getExtentReport() {
		String reportpath = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportpath);
		reporter.config().setReportName("DemoBlaze test report");
		reporter.config().setDocumentTitle("DemoBlaze test report title");
		extentReport = new ExtentReports();
		extentReport.attachReporter(reporter);
		extentReport.setSystemInfo("operating system", "Windows 11");
		extentReport.setSystemInfo("Tested By", "Surendhar Rajasekar");
		return extentReport;
	}

}
