package TestCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseTest.Base;
import pageobjects.Login;

public class Loginpage extends Base {
	
	public  WebDriver driver;
	@BeforeMethod
	public void launchapplication1() throws IOException {
		
		driver=initializeDriver();
		driver.get("https://staging.octowill.com/app-v2/login");
	}
	
	@AfterMethod
	public void teardown1() {
        driver.close();
	}

	String[] data = { "qa+safa@sfsf.com", "qa+sfsf@fdfds.com", "qa+adda@octewo.com" };

	@DataProvider(name = "logindata")
	public String[] dataprovider() {

		return data;
	}

	@Test(dataProvider = "logindata",priority =0)
	public void loginNegativeMailID(String Uname) throws InterruptedException, IOException {

		Login login = new Login(driver);
		login.enterEmail(Uname);
		login.clickLogin();
		String actual = login.getErrorText();
		Assert.assertEquals("Invalid Username / Phone No.", actual);

	}
	

	@Test(priority =1)
	public void loginNegativeInvalidOTP() throws InterruptedException {
		Login login = new Login(driver);
		login.enterEmail("qa+testing@octowill.com");
		login.clickLogin();
		login.OTP("665825");
		login.verifyButton();
		String actual = login.getErrorText();
		Assert.assertEquals("Invalid OTP", actual);

	}

	@Test(priority =2)
	public void loginPositive() throws InterruptedException {
		Login login = new Login(driver);
		login.enterEmail("qa+testing@octowill.com");
		login.clickLogin();
		login.OTP("665822");
		login.verifyButton();
		String actual = login.getErrorText();
		Assert.assertEquals("Logged In Successfully", actual);

	}

}
