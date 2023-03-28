package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCategoryPage {
	
	public WebDriver driver;

	public CreateCategoryPage(WebDriver driver) {
		this.driver = driver;

	}
	

	By ForDigitalAssets=By.xpath("//span[text()=' For Digital assets ']");
	By ForTraditionalAsset=By.xpath("(//span[@class='mdc-button__label'])[2]");
	By TrustDocument=By.xpath("//span[text()=' For Traditional assets ']");
	By OtherProductAddOn=By.xpath("//span[text()=' Other Products (Add ons ) ']");


public void ForDigitalAsset() {
	driver.findElement(ForDigitalAssets).click();
	
}

public void ForTraditionalAsset() {
	driver.findElement(ForTraditionalAsset).click();
}

public void TrustDocument() {
	
	driver.findElement(TrustDocument).click();
}

public void OtherProductsAddOn() {
	
	driver.findElement(OtherProductAddOn).click();
}
}
