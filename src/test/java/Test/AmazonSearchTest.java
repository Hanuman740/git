package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Amazon;
import Pojo.Browser;

public class AmazonSearchTest {

WebDriver driver;
  @BeforeMethod

public void launchBrowser() {
	  driver=Browser.openBrowser("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_6wtddap4vj_b&adgrpid=67426081828&hvpone=&hvptwo=&hvadid=294136395331&hvpos=&hvnetw=g&hvrand=16446956241379681541&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062114&hvtargid=kwd-319952186861&hydadcr=15412_1746882&gclid=CjwKCAjw9qiTBhBbEiwAp-GE0QOjjMLjGmesKFZY2DLVbqzuIBtzjKk_Fg1WMFQtUddjoKOn4lhsnBoCLxkQAvD_BwE");
  }
  @Test
  public void SearchWatches() throws InterruptedException {
	  Amazon abc=new Amazon(driver);
	  abc.searchWindow();
	  Thread.sleep(2000);
	  abc.clickOnSubmit();
	  Thread.sleep(2000);
	  abc.clickOnTitan();
	  Thread.sleep(2000);
	  abc.clickOnAnalogue();
	  Thread.sleep(2000);
	  abc.clickOnLeather();
	  Thread.sleep(2000);
	  Thread.sleep(2000);
	  abc.clickOnDiscount();
      Thread.sleep(3000);
	  abc.clickOnBlackDialWatch();
	  
     
  }
}
