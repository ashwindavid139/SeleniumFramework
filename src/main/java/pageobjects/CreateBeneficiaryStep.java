package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateBeneficiaryStep {
	
	public WebDriver driver;

	public CreateBeneficiaryStep(WebDriver driver) {
		this.driver = driver;

	}
	
	By CreateBeneficiary_Btn=By.xpath("//span[contains(text(),'Create Beneficiaries')]");
	By SelectFromthelist=By.xpath("//span[contains(text(),' Select from my list ')]");
	By BeneficiaryType=By.xpath("//mat-select[@placeholder='Beneficiary Type']");
	By BeneficiaryList=By.xpath("(//mat-option[@role='option'])[1]");
	By BeneficiaryName=By.xpath("//input[@formcontrolname='name']");
	By BeneficiaryEmail=By.xpath("//input[@formcontrolname='email']");
	By Countrycode=By.xpath("//mat-select[@formcontrolname='countryCode']");
	By PhoneNumber=By.xpath("//input[@formcontrolname='number']");
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
	By Relationship=By.xpath("//mat-select[@formcontrolname='relationship']");
	By Relationshippick=By.xpath("(//mat-option[@role='option'])[2]");
	By SameAsTetator=By.xpath("//label[contains(text(),'Same As Testator')]");
	By HomeDropdwon=By.xpath("(//mat-expansion-panel-header[@role='button'])[6]");
    By RemoveBeneficary=By.xpath("(//span[@class='mdc-button__label'])[5]");
    By EditEbeneficiary=By.xpath("(//span[@class='mdc-button__label'])[6]");
    By ProceedNext=By.xpath("(//span[@class='mdc-button__label'])[8]");
    By Select=By.xpath("(//span[text()=' Select '])[1]");
    By ConfirmYes=By.xpath("//span[contains(text(),'Yes')]");

    
    public void Selectfromthelist() {
    	driver.findElement(SelectFromthelist).click();
    	driver.findElement(Select).click();
    }
public void RemoveBeneficiary() {
	driver.findElement(SelectFromthelist).click();
	driver.findElement(Select).click();
	driver.findElement(HomeDropdwon).click();
	driver.findElement(RemoveBeneficary).click();
	driver.findElement(ConfirmYes).click();
    	
}
public void Benproceednext() {
	driver.findElement(ProceedNext).click();
}


}

