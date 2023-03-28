package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ManageMyBeneficairy {

	
	public WebDriver driver;

	public ManageMyBeneficairy(WebDriver driver) {
		this.driver = driver;

	}
	By AddNewBeneficairy=By.xpath("//span[contains(text(),'Add New Beneficiary to my List')]");
	By BeneficiaryType=By.xpath("//mat-select[@placeholder='Beneficiary Type']");
	By BeneficiaryList=By.xpath("(//mat-option[@role='option'])[1]");
	By BeneficiaryName=By.xpath("//input[@formcontrolname='name']");
	By BeneficiaryEmail=By.xpath("//input[@formcontrolname='email']");
	By PhoneNumber=By.xpath("//input[@formcontrolname='number']");
	By CountryCode = By.xpath("//mat-select[@formcontrolname='countryCode']");
	By countrycodepick = By.xpath("//span[contains(.,'Singapore +65')]");
	By phoneNumber = By.xpath("//input[@formcontrolname='number']");
	By MaritalStatus = By.xpath("//mat-select[@formcontrolname='maritalStatus']");
	By MaritalStatusSingle = By.xpath("//span[text()='Single']");
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
	By Relationship=By.xpath("//mat-select[@formcontrolname='relationship']");
	By Relationshippick=By.xpath("(//mat-option[@role='option'])[2]");
	By SameAsTetator=By.xpath("//label[contains(text(),'Same As Testator')]");
	By HomeDropdwon=By.xpath("(//mat-expansion-panel-header[@role='button'])[6]");
    By RemoveBeneficary=By.xpath("(//span[@class='mdc-button__label'])[5]");
    By EditEbeneficiary=By.xpath("(//span[@class='mdc-button__label'])[6]");
    By ProceedNext=By.xpath("(//span[@class='mdc-button__label'])[8]");
    By Select=By.xpath("(//span[text()=' Select '])[1]");
    By ConfirmYes=By.xpath("//span[contains(text(),'Yes')]");
    By DOB=By.xpath("(//span[@class='mat-mdc-button-touch-target'])[1]");
    By DOBYear=By.xpath("//button[contains(@class,'mat-calendar-period-button')]");
    By DOByear2=By.xpath("(//button[contains(@class,'mat-calendar-body-cell')])[1]");
    By DOBMonth=By.xpath("//div[contains(text(),'FEB')]");
    By DOBDate=By.xpath("//div[contains(text(),'14')]");
    
    public void AddNewBeneficairy() {
    	driver.findElement(AddNewBeneficairy).click();
    }
    
    public void BeneficaryDetails() throws InterruptedException {
    	
    	driver.findElement(BeneficiaryName).sendKeys("ben1");
    	driver.findElement(BeneficiaryEmail).sendKeys("ben1@octowill.com");
    	Thread.sleep(2000);
//    	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement countrycode= driver.findElement(By.xpath("//mat-select[@formcontrolname='countryCode']"));
//		wait.until(ExpectedConditions.elementToBeClickable(countrycode));
    	driver.findElement(CountryCode).click();
    	//Thread.sleep(2000);
    	driver.findElement(countrycodepick).click();
    	driver.findElement(phoneNumber).sendKeys("1323254");
    	driver.findElement(MaritalStatus).click();
    	Thread.sleep(1000);
    	driver.findElement(MaritalStatusSingle).click();
    	driver.findElement(Relationship).click();
    	Thread.sleep(1000);
    	driver.findElement(Relationshippick).click();
    	
    	driver.findElement(DOB).click();
    	driver.findElement(DOBYear).click();
    	driver.findElement(DOByear2).click();
    	driver.findElement(DOBMonth).click();
    	driver.findElement(DOBDate).click();
    }
    
    public void IdentificationDetails() throws InterruptedException {
    	
    	driver.findElement(IdIssuedCountry).click();
    	driver.findElement(IDIssuedcountrydropdown).click();
    	driver.findElement(IDType).click();
    	Thread.sleep(1000);
    	driver.findElement(IDtypedropdown).click();
    	Thread.sleep(1000);
    	driver.findElement(IDNumber).sendKeys("124848");
    	driver.findElement(SameAsTetator).click();
    	driver.findElement(SaveButton).click();
    	
    	
    }
    
    public String Successmsg() {
    	
    		String actual =driver.findElement(SuccessMsg).getText();
    		return actual;
    	}
    
    
    
    
}
