package Pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	 public static WebDriver openBrowser(String url) {
		  ChromeOptions options=new ChromeOptions();
		  options.addArguments("--disable-notifications");
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HANUMAN SHINDE\\eclipse-workspace\\ZerodhaAutomation\\src\\main\\resources\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver(options);//upcasting
	        driver.get(url);
	        driver.manage().window().maximize();
	        return driver;
	    }
}
