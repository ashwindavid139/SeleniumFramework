package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Step1Page {
	
	public WebDriver driver;

	public Step1Page(WebDriver driver) {
		this.driver = driver;

	}
	
	By Edit =By.xpath("//span[contains(text(),'Edit')]");
	By Proceedbutton=By.xpath("(//span[@class='mdc-button__label'])[4]");
	By ProceedAfterjoint=By.xpath("//span[contains(text(),'Proceed to Step - 2')]");
	By FullName = By.xpath("//input[@formcontrolname='name']");
	By Email = By.xpath("//input[@formcontrolname='email']");
	By DOB = By.xpath("//span[@class='mat-mdc-button-persistent-ripple mdc-icon-button__ripple']");
	By DOBdate = By.xpath("(//button[@type='button'])[16]");
	By CountryCode = By.xpath("//mat-select[@formcontrolname='countryCode']");
	By countrycodepick = By.xpath("//span[text()=' +60']");
	By phoneNumber = By.xpath("//input[@formcontrolname='number']");
	By MaritalStatus = By.xpath("//mat-select[@formcontrolname='maritalStatus']");
	By MaritalStatusSingle = By.xpath("//mat-option[@id='mat-option-6']");
	By IdIssuedCountry = By.xpath("//mat-select[@formcontrolname='idIssuedCountry']");
	By IDIssuedcountrydropdown = By.xpath("//mat-option[@role=\"option\"]/span[text()='Malaysia']");
	By IDType = By.xpath("//mat-select[@formcontrolname='idType']");
	By IDtypedropdown = By.xpath("(//mat-option[@role='option'])[1]");
	By IDNumber = By.xpath("//input[@formcontrolname='idNumber']");
	By Addressline1 = By.xpath("//input[@placeholder='Address Line1']");
	By Addressline2 = By.xpath("//input[@placeholder='Address Line2']");
	By CityName = By.xpath("//input[@placeholder='City']");
	By PostalCode = By.xpath("//input[@placeholder='Postal code']");
	By State = By.xpath("//input[@placeholder='State']");
	By SaveButton = By.xpath("//button[@type='submit']");
	By SuccessMsg = By.xpath("//div[contains(@class,'notificationDesc')]");
	By BackButton=By.xpath("//span[contains(text(),'Back')]");
	By Selectfromlist=By.xpath("//span[contains(text(),' Select from my list ')]");
	By SelectJointcustomer=By.xpath("(//span[contains(text(),'Select')])[7]");



public void PersonalDetails1(String name) throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(Edit).click();
	driver.findElement(FullName).clear();
	driver.findElement(FullName).sendKeys(name);
	
}

public void PersonalDetails2(String name) throws InterruptedException {
	driver.findElement(phoneNumber).clear();
	driver.findElement(phoneNumber).sendKeys(name);
	driver.findElement(CountryCode).click();
	Thread.sleep(2000);
	driver.findElement(countrycodepick).click();
	Thread.sleep(2000);
	driver.findElement(MaritalStatus).click();
	Thread.sleep(2000);
	driver.findElement(MaritalStatusSingle).click();
}

public void Identification(String number) throws InterruptedException {
	driver.findElement(IDNumber).clear();
	driver.findElement(IDNumber).sendKeys(number);
	driver.findElement(IdIssuedCountry).click();
	Thread.sleep(2000);
	driver.findElement(IDIssuedcountrydropdown).click();
//	driver.findElement(IDType).click();
//	driver.findElement(IDtypedropdown).click();
	
}

public void AddressFOrCommunication() throws InterruptedException {
	driver.findElement(Addressline1).clear();
	driver.findElement(Addressline1).sendKeys("28");
	driver.findElement(Addressline2).clear();
	driver.findElement(Addressline2).sendKeys("ch");
	driver.findElement(CityName).clear();
	driver.findElement(CityName).sendKeys("chennai");
	driver.findElement(PostalCode).clear();
	driver.findElement(PostalCode).sendKeys("6001412");
	driver.findElement(State).clear();
	driver.findElement(State).sendKeys("tamilnadu");
	Thread.sleep(3000);
	driver.findElement(SaveButton).click();
}

public String successmsg() {
	String actual =driver.findElement(SuccessMsg).getText();
	return actual;
}

public void proceednext() throws InterruptedException {

//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
//	wait.until(ExpectedConditions.elementToBeClickable(Proceedbutton));
//	WebElement element = driver.findElement(Proceedbutton);
//	wait.until(ExpectedConditions.visibilityOf(element));
	driver.findElement(Proceedbutton).click();
}

public void SelectJointCustomer() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(Selectfromlist).click();
	driver.findElement(SelectJointcustomer).click();
}
public void ProceedAfterjoint() throws InterruptedException {
	Thread.sleep(4000);
	driver.findElement(ProceedAfterjoint).click();
}
}
