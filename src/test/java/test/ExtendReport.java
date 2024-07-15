package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.baseTest;

import java.io.IOException;

public class ExtendReport extends baseTest {

    ExtentSparkReporter sparkReporter;
    ExtentReports extentReports;
    ExtentTest extentTest;

    @BeforeTest
    public void startReport(){

    }

    @Test
    public void test() throws IOException {
        extentTest.log(Status.PASS,"TestCase is Pass");

    }

    @AfterMethod
    public void afterMethod(){
        String path = baseTest.takeScreenshots("test");
        extentTest.addScreenCaptureFromPath(path);
        extentTest.fail("TestCase is Fail" );

    }

    @AfterTest
    public void endReport(){
        extentReports.flush();
    }
}

