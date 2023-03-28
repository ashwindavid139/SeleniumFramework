package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExistingWillStep {
	
	public WebDriver driver;

	public ExistingWillStep(WebDriver driver) {
		this.driver = driver;

	}
	
	By AddExistingWill=By.xpath("//span[contains(text(),'Add Existing Will')]");
	By WillNumber=By.xpath("//input[@formcontrolname='willNumber']");
    By WillWritenBy=By.xpath("//input[@formcontrolname='willWrittenBy']");
    By Save=By.xpath("//span[contains(text(),'Save')]");
    By Back =By.xpath("//span[contains(text(),'Back')]");
    By Remove=By.xpath("//span[contains(text(),'Remove')]");
    By ProceedNext=By.xpath("(//span[@class='mdc-button__label'])[8]");
    By DOB=By.xpath("(//span[@class='mat-mdc-button-touch-target'])[1]");
    By DOBYear=By.xpath("//button[contains(@class,'mat-calendar-period-button')]");
    By DOByear2=By.xpath("(//button[contains(@class,'mat-calendar-body-cell')])[1]");
    By DOBMonth=By.xpath("//div[contains(text(),'FEB')]");
    By DOBDate=By.xpath("//div[contains(text(),'14')]");
    


public void ExistingWill() {
	
	driver.findElement(AddExistingWill).click();
	driver.findElement(DOB).click();
	driver.findElement(DOBYear).click();
	driver.findElement(DOByear2).click();
	driver.findElement(DOBMonth).click();
	driver.findElement(DOBDate).click();
	driver.findElement(WillNumber).sendKeys("1234");
	driver.findElement(WillWritenBy).sendKeys("Demo");
	driver.findElement(Save).click();
}

}
