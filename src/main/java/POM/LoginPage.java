package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	@FindBy(xpath="//div[@class='form-header text-center']")private WebElement LoginText;
	@FindBy(xpath="//input[@id='userid']")private WebElement userName;
	//findelement
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//input[@id='pin']")private WebElement PINcode;
	@FindBy(xpath="//button[@type='submit']")private WebElement Continue;

	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement ForgotIDpass;
	@FindBy(xpath="(//a[@target='_blank'])[1]")private WebElement playstore;
	@FindBy(xpath="(//a[@target='_blank'])[2]")private WebElement ios;
	@FindBy(xpath="//img[@alt='Zerodha']")private WebElement Zerodha;
	@FindBy(xpath="(//a[@target='_blank'])[3]")private WebElement signup;


	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		public String getLoginText(){
			return LoginText.getText();
		}
	
	public void enterUserName(String name) {
		userName.sendKeys(name);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnSubmit() {
		submit.click();
	}
	public void enterPINcode(String pin,WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(PINcode));//wait condition
		PINcode.sendKeys(pin);
	}
	public void clickOnContinue() {
		Continue.click();
	}

	public void clickOnforgotpassword() {
		ForgotIDpass.click();
	}
	public void ClickOnplaystore() {
		playstore.click();
	}
	public void ClickOnios() {
		ios.click();
	}
	public void ClickOnZerodha() {
		Zerodha.click();
	}
	public void ClickOnsignup() {
		signup.click();
	}
	}
	
	

