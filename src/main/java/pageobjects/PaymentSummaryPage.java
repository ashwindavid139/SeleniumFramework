package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentSummaryPage {
	
	public WebDriver driver;

	public PaymentSummaryPage(WebDriver driver) {
		this.driver = driver;

	}
	
	By MoveToDraft=By.xpath("//span[contains(text(),'Move to Draft')]");
	By EnterCoupon=By.xpath("//input[@formcontrolname='couponCode']");
	By Apply=By.xpath("//button[@type='submit']");
	By UseWalletBalance=By.xpath("//input[@type='checkbox']");
	By CredtDebit=By.xpath("//div[contains(text(),'Credit / Debit')]");
	By OnlineBanking=By.xpath("//div[contains(text(),' Online Banking ')]");
	By WalletCredit=By.xpath("//div[contains(text(),' Wallet Credit ')]");
	By PayInstallment=By.xpath("//div[contains(text(),' Pay Instalment ')]");
	By PayNow=By.xpath("(//button[contains(@class,'addBtn')])[2]");
	By SuccessMsg = By.xpath("//div[contains(@class,'notificationDesc')]");

	
	public void CreditDebit() {
		driver.findElement(CredtDebit).click();
		driver.findElement(PayNow).click();
	}
	
	public void WalletCredit() {
		
		driver.findElement(WalletCredit).click();
		driver.findElement(PayNow).click();
	}
	
	public String SuccessMsg() {

		String actual = driver.findElement(SuccessMsg).getText();
		return actual;
	}
}
