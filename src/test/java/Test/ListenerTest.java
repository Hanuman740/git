package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilities.ScreenShot;

public class ListenerTest extends BaseTest implements ITestListener{
public void onTestStart(ITestResult Result) {//this will run at the start of every test
	System.out.println("Test has started"+Result.getName());
}
public void onTestSuccess(ITestResult Result) {//will execute when test passes
	System.out.println(Result.getName()+"Test is passed");
}
public void onTestFailure(ITestResult Result) {//will execute when test fails
	try {
		ScreenShot.Getscreenshot(driver, Result.getName());
	}catch(IOException e) {
		e.printStackTrace();
	}
}
public void onTestSkipped(ITestResult Result) {//will execute when test Skipped
	System.out.println(Result.getName()+"Test Skipped");
}

}
