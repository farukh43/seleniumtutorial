package class46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onStart(ITestContext context) {
		System.out.println("This is onStart -- Test execution is started ....");

	}

	public void onTestStart(ITestResult result) {
		System.out.println("This is on onTestStart method -- Test Started ....");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("This is on onTestSuccess method  -- Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("This is on onTestFailure method  -- Test Failed...");

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("This is on onTestSkipped method  -- Test Skipped...");

	}

	public void onFinish(ITestContext context) {
		System.out.println("This is onFinish -- Test execution is completed...");

	}
}
