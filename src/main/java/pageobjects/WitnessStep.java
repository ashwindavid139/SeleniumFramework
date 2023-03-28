package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WitnessStep {
	public WebDriver driver;

	public WitnessStep(WebDriver driver) {
		this.driver = driver;

	}
	
	By CreateWitness=By.xpath("//span[text()='Create Witness']");
	By Selectfromthelist=By.xpath("//span[text()=' Select from my list ']");
	By Select=By.xpath("(//span[text()=' Select '])[1]");
	By WitnessDrop=By.xpath("//mat-panel-title[@class='mat-expansion-panel-header-title cardHeader fx-row wd-100 start-center ng-tns-c79-887']");
	By RemoveWitness=By.xpath("//span[text()='Remove']");
	By EditWitness=By.xpath("//span[text()=' Edit Witness ']");
	By ProceedNext=By.xpath("//button[contains(@class,'proceedBtn')]");
	By Name=By.xpath("//input[@formcontrolname='name']");
	By WitnessEmail=By.xpath("//input[@formcontrolname='email']");
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
	By ConfirmYes=By.xpath("//span[contains(text(),'Yes')]");
	
	
	public void SelectFromthelist() {
		
		driver.findElement(Selectfromthelist).click();
		driver.findElement(Select).click();
		
	}
	
	public void Removewitness() {
		
		driver.findElement(WitnessDrop).click();
		driver.findElement(RemoveWitness).click();
		driver.findElement(ConfirmYes).click();
	}
	
	public void ProccedNext() {
		
		driver.findElement(ProceedNext).click();
	}
	

}
