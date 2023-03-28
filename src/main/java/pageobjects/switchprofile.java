package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class switchprofile {

	WebDriver driver;

	public switchprofile(WebDriver driver) {
		this.driver = driver;

	}

	By switchProfile = By.xpath("//div[text()='Switch Profile']");
	By switchToPartner = By.xpath("//div[text()=' Switch to Partner ']");
	By switchToAgent = By.xpath("//div[text()=' Switch to Agent ']");
	By swithToManager = By.xpath("//div[text()=' Switch to Manager ']");
	By switchToCustomer = By.xpath("//div[text()=' Switch to Customer ']");
    By getText =By.xpath("(//div[contains(@class,'cardHeader')][1])[1]");
	
	
	public void switchProfile() {

		driver.findElement(switchProfile).click();
	}

	public void switchToPartner() {

		driver.findElement(switchToPartner).click();
	}

	public void switchToAgent() {

		driver.findElement(switchToAgent).click();
	}

	public void swithToManager() {

		driver.findElement(swithToManager).click();
	}

	public void switchToCustomer() {

		driver.findElement(switchToCustomer).click();
	}
	
	public String gettext() {

		String actual = driver.findElement(getText).getText();
		return actual;
		
	}

}
