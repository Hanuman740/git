package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	@FindBy(xpath="//div[@id='avatar-83']")private WebElement avatar;
	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public boolean avatarIsDisplayed(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(avatar));
		return avatar.isDisplayed();
	}
	public void Home() {
		System.out.println("Pune");
	}
}
