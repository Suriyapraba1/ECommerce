package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import test.baseTest;

public class TestNGListener implements ITestListener {

    ExtentSparkReporter sparkReporter;
    ExtentReports extentReports;
    ExtentTest extentTest;

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extentReports.createTest("Verify the TestCases" + result.getMethod().getMethodName());
        System.out.println("Test Started");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.log(Status.PASS,"TestCase is Pass");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testCaseName = result.getMethod().getMethodName();
        String path = baseTest.takeScreenshots(testCaseName);
        extentTest.log(Status.FAIL,"TestCases is Failed");
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
    public void onStart(ITestContext context) {
        extentReports = new ExtentReports();
        sparkReporter = new ExtentSparkReporter("ExtendReport/Extend.html");
        extentReports.attachReporter(sparkReporter);
        sparkReporter.config().setDocumentTitle("Regression Tests");

    }

    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }

}