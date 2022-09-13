package org.tyss.generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class PracticeListnersreport implements ITestListener {

	 private ExtentTest test;
	public ExtentReports repot;
	 public static ExtentTest logTest;
	
	
	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter spark=new ExtentSparkReporter("./outputreport/Suite-emailable.html");
		spark.config().setDocumentTitle("Report");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("Spark");
		ExtentReports repot=new ExtentReports();
		repot.attachReporter(spark);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
	
		test = repot.createTest(getClass().getName());
		logTest=test;
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		repot.flush();
	}

	@Override
	public void onTestFailure(ITestResult result) {
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	

	@Override
	public void onFinish(ITestContext context) {
	}

}
