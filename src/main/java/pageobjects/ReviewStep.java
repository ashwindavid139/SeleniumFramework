package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReviewStep {
	
	public WebDriver driver;

	public ReviewStep(WebDriver driver) {
		this.driver = driver;

	}
	
	
	By Testtator=By.xpath("//mat-expansion-panel-header[@aria-controls='cdk-accordion-child-295']");
	By ProdeecNext=By.xpath("//button[contains(@class,'proceedBtn')]");

	
	public void ProceedNext() {
		
		driver.findElement(ProdeecNext).click();
	}
}
