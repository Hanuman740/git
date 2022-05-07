package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderIBM {

	@FindBy(xpath="(//label[@class='su-radio-label'])[5]")private WebElement Intraday;
	@FindBy(xpath="(//label[@class='su-radio-label'])[6]")private WebElement Longterm;
	@FindBy(xpath="//input[@label='Qty.']")private WebElement Qty;
	@FindBy(xpath="//input[@label='Price']")private WebElement Price;
	@FindBy(xpath="(//label[@class='su-radio-label'])[7]")private WebElement Market;
	@FindBy(xpath="//input[@label='Trigger price']")private WebElement TriggerPrice;
	@FindBy(xpath="(//label[@class='su-radio-label'])[9]")private WebElement StopLoss;
	@FindBy(xpath="//button[@type='submit']")private WebElement BuyButton;
	public PlaceOrderIBM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void EnterQty() {
		Qty.sendKeys("25");
	}
	public void ClearTriggerPrice() throws InterruptedException {
		TriggerPrice.clear();
		Thread.sleep(2000);
	}
	public void EnterTriggerPrice() {
		TriggerPrice.sendKeys("178");
	}
	public void ClickOnMarket() {
		Market.click();
	}
	
	public void ClickOnLongterm() {
		Longterm.click();
	}
	public void ClickOnStopLoss() {
		StopLoss.click();
	}
	public void ClickOnBuybutton() {
		BuyButton.click();
	}

}
