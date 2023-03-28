package TestCase;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.Base;
import pageobjects.Login;
import pageobjects.MyProfile;

public class myProfile extends Base {
	public  WebDriver driver;
	MyProfile profile;

	@BeforeTest
	public void launchapplication() throws IOException {

		driver = initializeDriver();
		driver.get("https://staging.octowill.com/app-v2/login");
		profile = new MyProfile(driver);
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

	@Test(priority = 0)
	public void loginPositive() {
		
		Login login = new Login(driver);
		login.enterEmail("qa+testing@octowill.com");
		login.clickLogin();
		login.OTP("665822");
		login.verifyButton();
		String actual = login.getErrorText();
		Assert.assertEquals("Logged In Successfully", actual);

	}

	@Test(priority = 1)
	public void myprofile() {

		profile.MenuMyProfile();
		profile.MyProfile();

	}

	@Test(enabled = false)
	public void Namefield() {
		profile.FullNameclear();
		profile.FullName("Apple Tes");
	}

	@Test(priority = 12)
	public void PhoneNumber() {
		profile.Phonenumberclear();
		profile.Phonenumber("5489515");

	}

	@Test(priority = 2)
	public void IdNumber() {
		profile.IdNumberClear();
		profile.IdNumber("12356");

	}

	@Test(priority = 3)
	public void Address1() {
		profile.Address1clear();
		profile.Address1("28");
	}

	@Test(priority = 4)
	public void Address2() {
		profile.Address2clear();
		profile.Address2("ch");

	}

	@Test(priority = 5)
	public void CityName() {
		profile.CityNameclear();
		profile.CityName("chennai");

	}

	@Test(priority = 6)
	public void PostalCode() {
		profile.PostalCodeClear();
		profile.PostalCode("60142245");

	}

	@Test(priority = 7)
	public void State() {
		profile.StateClear();
		profile.State("TamilNadu");

	}

	@Test(priority = 8)
	public void MaritalStatus() {
		profile.MaritalStatus();
		
		profile.MaritalStatusSingle();
	}

	@Test(priority = 9)
	public void CountryCode() throws InterruptedException {
		profile.CountryCode();
		profile.CountryCodepick();

	}

	@Test(priority = 10)
	public void IdIssuedCountry() throws InterruptedException {
		profile.scrollToAddressforCommunication();
		profile.IdIssuedCountry();
		profile.IdIssuedCountrypick();

	}

	@Test(priority = 11)
	public void IdType() throws InterruptedException {
		profile.IdType();
		profile.IDTypeDropdown();
	}

	@Test(priority = 13)
	public void BankName() {
		profile.BankNameClear();
		profile.BankName("Axis");
	}

	@Test(priority = 14)
	public void AccountNumber() {
		profile.AccNumberClear();
		profile.AccNumber("124578");

	}

	@Test(priority = 15)
	public void BranchName() {
		profile.BankNameClear();
		profile.BankName("K K Nagar");
	}

	@Test(priority = 16)
	public void Save() {
		MyProfile profile = new MyProfile(driver);
		profile.SaveButton();
		String actual = profile.SuccessMsg();
		Assert.assertEquals("Updated Successfully", actual);

	}

	@Test(enabled = false)
	public void DOB() {
		MyProfile profile = new MyProfile(driver);
		profile.DOB();
		
		profile.DOBdate();
	}

	@Test(enabled = false)
	public void MyPofileUpdate() throws InterruptedException {
		
		MyProfile profile = new MyProfile(driver);
		profile.FullNameclear();
		profile.FullName("Apple Test");
		profile.DOB();
		profile.DOBdate();
		profile.CountryCode();
		profile.CountryCodepick();
		profile.Phonenumberclear();
		profile.Phonenumber("5489515");
		profile.MaritalStatus();
		profile.MaritalStatusSingle();
		profile.IdIssuedCountry();
		profile.IdIssuedCountrypick();
		profile.IdType();
		profile.IDTypeDropdown();
		profile.IdNumberClear();
		profile.IdNumberClear();
		profile.Address1clear();
		profile.Address1("ch1");
		profile.Address2clear();
		profile.Address2("ch2");
		profile.CityNameclear();
		profile.CityName("chennai");
		profile.PostalCodeClear();
		profile.PostalCode("6011244");
		profile.StateClear();
		profile.State("TamilNadu");
		profile.SaveButton();
		String actual = profile.SuccessMsg();
		Assert.assertEquals("", actual);

	}

}
