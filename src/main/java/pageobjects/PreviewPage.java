package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreviewPage {
	
	public WebDriver driver;

	public PreviewPage(WebDriver driver) {
		this.driver = driver;

	}
	
	By TermsandConditions=By.xpath("//input[@type='checkbox']");
	By ProceedToCart=By.xpath("//span[text()=' Proceed To Cart ']");
	
	public void CheckBox() {
		
		driver.findElement(TermsandConditions).click();
	}
	
	public void ProceedToCart() {
		driver.findElement(ProceedToCart).click();
	}

}
