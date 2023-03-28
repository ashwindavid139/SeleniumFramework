package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assetpage {
	
	public WebDriver driver;

	public Assetpage(WebDriver driver) {
		this.driver = driver;

	}
	
	By BasicDistribution=By.xpath("//input[@placeholder='0']");
	By proceedNext=By.xpath("//button[contains(@class,'proceedBtn')]");



public void BasicDistribution() {
	
	driver.findElement(BasicDistribution).sendKeys("100");
}

public void ProceedNext() {
	driver.findElement(proceedNext).click();
}
}