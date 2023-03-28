package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateProductsPage {
	
	public WebDriver driver;

	public CreateProductsPage(WebDriver driver) {
		this.driver = driver;

	}
	
	By All=By.xpath("//div[text()='All']");
    By DigitalAsset=By.xpath("//div[text()=' Digital Assets ']");
    By TraditionalAsset=By.xpath("//div[text()=' Traditional Assets ']");
    By TrustDocuments=By.xpath(" Trust Documents ");
    By OthersAddOn=By.xpath("//div[text()=' Others (Add-ons) ']");
    By eNomination=By.xpath("(//div[text()=' e-Nomination '])[1]");
    By ConventionalWill=By.xpath("(//div[text()=' Conventional Will '])[1]");
    By Islamic=By.xpath("(//div[text()=' Islamic (Wasiyyah) '])[1]");
    By HibahAmanah=By.xpath("(//div[text()=' Hibah Amanah '])[1]");
    By Trust =By.xpath("(//div[text()=' Trust '])[1]");
    By Insurance =By.xpath("(//div[text()=' Insurance '])[1]");
    By ResetFilter=By.xpath("//span[text()='Reset Filters']");
    By CreateBaseWill =By.xpath("//span[contains(text(),'Create My Base Will')]");
    By CreateaAdvancewill=By.xpath("//span[contains(text(),'CreateAdvanceWill')]");


public void CreateBaseWill() {
	driver.findElement(CreateBaseWill).click();
}

public void CreateAdvanceWill() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(CreateaAdvancewill));
	driver.findElement(CreateaAdvancewill).click();
	
}

}
