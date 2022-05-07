package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyIBM {

	@FindBy(xpath="//input[@type='text']")private WebElement Search;
	@FindBy(xpath="//span[text()='IBMFNIFTY']")private WebElement IBM;
	@FindBy(xpath="(//button[@class='button-blue'])[1]")private WebElement Buy;
	@FindBy(xpath="//button[@class='button-orange']")private WebElement Sell;
	@FindBy(xpath="//span[@class='icon icon-trending-up']")private WebElement Chart;
	@FindBy(xpath="(//span[contains(@class,'icon icon-')])[4]")private WebElement MarketDW;
	@FindBy(xpath="(//span[contains(@class,'icon icon-')])[5]")private WebElement Added;
	
	public BuyIBM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	} 
		public void InsertInSearch() {
			Search.sendKeys("IBM");
		}
	public void MoveToIBM(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(IBM);
		act.perform();
	}
	public void ClickOnBuy() {
		Buy.click();
}
	public void ClickOnSell() {
		Sell.click();
}
	public void ClickOnChart() {
		Chart.click();
}
	public void ClickOnMarketDW() {
		Buy.click();
}
	public void ClickOnAdded() {
		Buy.click();
}

}
