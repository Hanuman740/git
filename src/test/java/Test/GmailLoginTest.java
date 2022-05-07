package Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import POM.Gmaillogin;
import Pojo.Browser;

public class GmailLoginTest {
	WebDriver driver;
@AfterClass
	public void LaunchBrowser() {
	 driver=Browser.openBrowser("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
@Test
public void LoginWithValidCredentials() throws InterruptedException {
  Gmaillogin abc=new Gmaillogin(driver);
  
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  
	abc.InsertEmailId("hanumanshinde45@gmail.com");
	Thread.sleep(2000);
	abc.ClickOnNext();
}
}
