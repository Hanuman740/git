package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.BuyIBM;
import POM.PlaceOrderIBM;
import POM.LoginPage;
import Pojo.Browser;

public class BuyTestIBM {

	WebDriver driver;
	@BeforeClass
	public void before(){
		System.out.println("Testing has started");
	}
	@Test
public void loginWithValidCredentials() throws EncryptedDocumentException, IOException, InterruptedException {
 driver=Browser.openBrowser("https://kite.zerodha.com/");
	LoginPage obj=new LoginPage(driver);
	obj.enterUserName("MB6485");
	obj.enterPassword("monkeydluffy9");
	obj.clickOnSubmit();
	
	Thread.sleep(2000);
	
	obj.enterPINcode("778866",driver);
	obj.clickOnContinue();

	Thread.sleep(1000);
	
	BuyIBM abc=new BuyIBM(driver);
	abc.InsertInSearch();
	abc.MoveToIBM(driver);
	Thread.sleep(1000);
	abc.ClickOnBuy();
	
PlaceOrderIBM xyz=new PlaceOrderIBM(driver);

	xyz.ClickOnLongterm();
	xyz.EnterQty();
	xyz.ClickOnMarket();
	//xyz.ClickOnBuybutton();
}
	@AfterClass
	public void After(){
		System.out.println("Testing Ended");
	}
}
