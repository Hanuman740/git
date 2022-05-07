package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmaillogin {
@FindBy(xpath="//div[@jsname='l4eHX']")private WebElement Title;
@FindBy(xpath="//div[@class=\"xkfVF\"]")private WebElement Frame ;
@FindBy(xpath="//input[@id='identifierId']")private WebElement Email;
@FindBy(xpath="//span[text()='Next']")private WebElement Next;
@FindBy(xpath="//input[@type='password']")private WebElement Password;
@FindBy(xpath="//input[@type='checkbox']")private WebElement CheckBox;
@FindBy(xpath="//span[text()='Next']")private WebElement Next1;
@FindBy(xpath="//div[@style='user-select: none']")private WebElement Compose;
@FindBy(xpath="//div[@aria-label='New Message']")private WebElement Iframe;
@FindBy(xpath="//textarea[@name='to']")private WebElement Tofield;
@FindBy(xpath="//input[@id=':ae']")private WebElement Subject;
@FindBy(xpath="//div[@role='textbox']")private WebElement TextBox;
@FindBy(xpath="//div[@id=':a4']")private WebElement Send;

public Gmaillogin(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void CheckTitle() {
	Title.isDisplayed();
}
public void InsertEmailId(String name) {
	Email.sendKeys(name);
}
public void ClickOnNext() {
	Next.click();
}
public void Insertpassword(String pass) {
	Password.sendKeys(pass);
}
public void ClickOnCheckBox() {
	CheckBox.click();
}
public void ClickOnNext1() {
	Next1.click();
}
public void ClickOnCompose() {
	Compose.click();
}
public void InsertToEmail(String to) {
	Email.sendKeys(to);
}
public void InsertSubject(String subject) {
	Email.sendKeys(subject);
}
public void InsertText(String text) {
	Email.sendKeys(text);
}
public void ClickOnSend() {
	Send.click();
	}
}