package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POM.HomePage;
import POM.LoginPage;
import Pojo.Browser;
import Utilities.Excel;
import Utilities.Reports;
import Utilities.ScreenShot;
@Listeners(ListenerTest.class)
public class ZerodhaLoginTest extends BaseTest {
//public static WebDriver driver;//property of parent
		ExtentReports reports;
		ExtentTest test;
	@BeforeClass
	public void configureExtentReport() {
		reports = Reports.addReport();
	}
	
	
	@BeforeMethod
	public void LaunchBrowser() {
		driver =Browser.openBrowser("https://kite.zerodha.com/");
	}
	@Test
	public void LoginWithValidCredentials() throws EncryptedDocumentException, IOException {
		test = reports.createTest("LoginWithValidCredentials");
		LoginPage loginpage=new LoginPage(driver);
		String actualText=loginpage.getLoginText();
		String expectedText="Login to Kite";
		
		SoftAssert softassert=new SoftAssert();//soft Assert
		softassert.assertEquals(actualText, expectedText);
	//	Assert.assertEquals(actualText, expectedText);//hard assert will immediately stop execution
		
		String user=Excel.getData(2, 1, "input1");
		loginpage.enterUserName(user);
		String pass=Excel.getData(1, 1, "input2");
		loginpage.enterPassword(pass);
		loginpage.clickOnSubmit();
		String pin=Excel.getData(2, 2, "input3");
		loginpage.enterPINcode(pin, driver);
		loginpage.clickOnContinue();
		
		HomePage home=new HomePage(driver);
		boolean status=home.avatarIsDisplayed(driver);
		softassert.assertTrue(status);//soft assert method
		System.out.println(status);
		softassert.assertAll();//will display failure in  the soft assert 
		
		//ScreenShot.Getscreenshot(driver,"Zerodha");
	}
	@Test
	public void Forgotpassword() {
		test = reports.createTest("Forgotpassword");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.clickOnforgotpassword();
		//Assert.assertTrue(false);//Test Fails and listener interface take screenshot
	}
	@Test(dependsOnMethods= {"Forgotpassword"})//test skipped
	public void loginbutton() {
		test = reports.createTest("loginbutton");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.clickOnSubmit();

	}
	@AfterMethod
	public void addTestResult(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
		test.log(Status.FAIL, result.getName());
	}
		else if(result.getStatus()==ITestResult.SUCCESS) 
	{
		test.log(Status.PASS, result.getName());
	}
	else {
		test.log(Status.SKIP, result.getName());
	}
}	
	@AfterClass
	public void flushResults() {
		reports.flush();
	}
}
