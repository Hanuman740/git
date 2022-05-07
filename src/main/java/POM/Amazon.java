package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon {

 @FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement Search;
 @FindBy(xpath="//input[@id='nav-search-submit-button']")private WebElement Submit;
 @FindBy(xpath="(//i[@class=\"a-icon a-icon-checkbox\"])[5]")private WebElement Titan;
 @FindBy(xpath="(//i[@class=\"a-icon a-icon-checkbox\"])[46]")private WebElement Analogue;
 @FindBy(xpath="(//i[@class=\"a-icon a-icon-checkbox\"])[55]")private WebElement Leather;
 @FindBy(xpath="//span[text()='25% Off or more']")private WebElement Discount;
 @FindBy(xpath=" //span[@class=\"a-size-base-plus a-color-base a-text-normal\"]")private WebElement BlackDialWatch;
 @FindBy(xpath=" (//div[@class=\"a-section a-spacing-none a-padding-none\"])[1]")private WebElement Iframe;
 @FindBy(xpath="//input[@name=\"submit.add-to-cart\"]")private WebElement AddToCard;
 @FindBy(xpath="//span[text()='Added to Cart']")private WebElement Text;
 
public Amazon(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void searchWindow() {
	Search.sendKeys("Wrist Watch");
}
public void clickOnSubmit() {
	Submit.click();
}
public void clickOnTitan() {
	Titan.click();
}
public void clickOnAnalogue() {
	Analogue.click();
}
public void clickOnLeather() {
	Leather.click();
}
public void clickOnDiscount() {
	Discount.click();
}
public void clickOnBlackDialWatch() {
	 BlackDialWatch.click();
}
public void iframe() {
	WebDriver driver = null;
	driver.switchTo().frame(Iframe);
}
public void clickOnAddToCard() {
	AddToCard.click();
}
}