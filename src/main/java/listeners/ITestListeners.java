package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseTest.Base;
import extentReports.ExtentReportersNG;


public class ITestListeners extends Base implements ITestListener {
	
	public WebDriver driver;
	ExtentReports extent = ExtentReportersNG.getReportObject();
	ExtentTest test;
	String testMethodName;
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		testMethodName = result.getMethod().getMethodName();
		test = extent.createTest(testMethodName);
		extentTest.set(test);
		
	}

	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, testMethodName+" has been Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		extentTest.get().fail(result.getThrowable());
		//captureScreenshot(result.getMethod().getMethodName()+".jpg");
		WebDriver driver = null;
		try {
			extentTest.get().log(Status.FAIL, testMethodName+" has been Failed");
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			extentTest.get().addScreenCaptureFromPath(ss1(testMethodName, driver), testMethodName);
		} catch (Exception e) {
			System.out.println("Unable to take Screenshot.");
			e.printStackTrace();
		}
	}


	public void onTestSkipped(ITestResult result) {
		extentTest.get().log(Status.SKIP, testMethodName+" has been Skipped");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	

}
