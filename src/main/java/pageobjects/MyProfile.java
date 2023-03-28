package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfile {

	public WebDriver driver;

	public MyProfile(WebDriver driver) {
		this.driver = driver;

	}

	By MenuMyprofile = By.xpath("//div[contains(@class,'nameText')]");
	By MyProfile = By.xpath("//div[text()='My Profile']");
	By FullName = By.xpath("//input[@formcontrolname='name']");
	By Email = By.xpath("//input[@formcontrolname='email']");
	By DOB = By.xpath("//span[@class='mat-mdc-button-persistent-ripple mdc-icon-button__ripple']");
	By DOBdate = By.xpath("(//button[@type='button'])[16]");
	By CountryCode = By.xpath("//div[@id='mat-select-value-1']");
	By countrycodepick = By.xpath("//span[text()=' Malaysia +60']");
	By phoneNumber = By.xpath("//input[@formcontrolname='number']");
	By MaritalStatus = By.xpath("//div[@id='mat-select-value-3']");
	By MaritalStatusSingle = By.xpath("//mat-option[@id='mat-option-6']");
	By IdIssuedCountry = By.xpath("//div[@id='mat-select-value-5']");
	By IDIssuedcountrydropdown = By.xpath("(//span[text()='Malaysia'])[2]");
	By IDType = By.xpath("//div[@id='mat-select-value-7']");
	By IDtypedropdown = By.xpath("(//span[text()='Passport'])[2]");
	By IDNumber = By.xpath("//input[@placeholder='ID Number']");
	By Addressline1 = By.xpath("//input[@placeholder='Address Line1']");
	By Addressline2 = By.xpath("//input[@placeholder='Address Line2']");
	By CityName = By.xpath("//input[@placeholder='City']");
	By PostalCode = By.xpath("//input[@placeholder='Postal code']");
	By State = By.xpath("//input[@placeholder='State']");
	By SaveButton = By.xpath("//button[@type='submit']");
	By SuccessMsg = By.xpath("//div[contains(@class,'notificationDesc')]");
	By BankName = By.xpath("//input[@placeholder='Bank Name']");
	By AccNumber = By.xpath("//input[@placeholder='Account Number']");
	By BranchName = By.xpath("//input[@placeholder='Branch Name']");
	
	By addressForCommunication = By.xpath("//div[contains(text(),'Address for Communication')]");

	public void MenuMyProfile() {

		driver.findElement(MenuMyprofile).click();

	}

	public void MyProfile() {

		driver.findElement(MyProfile).click();
	}

	public void FullNameclear() {

		driver.findElement(FullName).clear();

	}

	public void FullName(String fullname) {
		driver.findElement(FullName).sendKeys(fullname);
	}

	public void Emailclear() {
		driver.findElement(Email).clear();

	}

	public void Email(String email) {
		driver.findElement(Email).sendKeys(email);

	}

	public void MaritalStatus() {

		driver.findElement(MaritalStatus).click();

	}

	public void MaritalStatusSingle() {

		driver.findElement(MaritalStatusSingle).click();

	}

	public void DOB() {

		driver.findElement(DOB).click();
	}

	public void DOBdate() {

		driver.findElement(DOBdate).click();
	}

	public void CountryCode() throws InterruptedException {
  // Thread.sleep(2000);
		driver.findElement(CountryCode).click();
	}

	public void CountryCodepick() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(countrycodepick).click();
	}

	public void Phonenumber(String phone) {
		driver.findElement(phoneNumber).sendKeys(phone);
	}

	public void Phonenumberclear() {
		driver.findElement(phoneNumber).clear();
	}
	
	public void scrollToAddressforCommunication() {
		WebElement element = driver.findElement(addressForCommunication);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void IdIssuedCountry() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(IdIssuedCountry).click();
	}

	public void IdIssuedCountrypick() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(IDIssuedcountrydropdown).click();
	}

	public void IdType() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(IDType).click();

	}

	public void IDTypeDropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(IDtypedropdown).click();
	}

	public void IdNumber(String IdNumber) {
		driver.findElement(IDNumber).sendKeys(IdNumber);
	}

	public void IdNumberClear() {
		driver.findElement(IDNumber).clear();
	}

	public void Address1(String Address) {
		driver.findElement(Addressline1).sendKeys(Address);
	}

	public void Address1clear() {
		driver.findElement(Addressline1).clear();
	}

	public void Address2(String Address2) {
		driver.findElement(Addressline2).sendKeys(Address2);
	}

	public void Address2clear() {
		driver.findElement(Addressline2).clear();
	}

	public void CityName(String Cityname) {

		driver.findElement(CityName).sendKeys(Cityname);
	}

	public void CityNameclear() {

		driver.findElement(CityName).clear();
	}

	public void PostalCode(String Postalcode) {
		driver.findElement(PostalCode).sendKeys(Postalcode);
	}

	public void PostalCodeClear() {

		driver.findElement(PostalCode).clear();
	}

	public void State(String state) {

		driver.findElement(State).sendKeys(state);
	}

	public void StateClear() {
		driver.findElement(State).clear();
	}

	public void SaveButton() {
		driver.findElement(SaveButton).click();
	}

	public String SuccessMsg() {

		String actual = driver.findElement(SuccessMsg).getText();
		return actual;
	}

	public void BankNameClear() {

		driver.findElement(BankName).clear();
	}

	public void BankName(String name) {

		driver.findElement(BankName).sendKeys(name);
	}

	public void AccNumberClear() {

		driver.findElement(AccNumber).clear();
	}

	public void AccNumber(String number) {

		driver.findElement(AccNumber).sendKeys(number);
	}

	public void BranchNameClear() {
		driver.findElement(BranchName).clear();
	}

	public void BranchName(String name) {
		driver.findElement(BranchName).sendKeys(name);
	}

}
