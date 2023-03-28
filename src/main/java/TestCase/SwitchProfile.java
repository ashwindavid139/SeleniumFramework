package TestCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.Base;
import pageobjects.Login;
import pageobjects.switchprofile;

public class SwitchProfile extends Base{
	public  WebDriver driver;
	@BeforeTest
	public void launchapplication() throws IOException {
		
		driver=initializeDriver();
		driver.get("https://staging.octowill.com/app-v2/login");
	}
	
	
	@AfterTest
	public void teardown() {
        driver.close();
	}
	
	@Test(priority =0)
	public void loginPositive() throws InterruptedException {
		Login login = new Login(driver);
		login.enterEmail("qa+testing@octowill.com");
		login.clickLogin();
		login.OTP("665822");
		login.verifyButton();
		String actual = login.getErrorText();
		Assert.assertEquals("Logged In Successfully", actual);

	}
	@Test(priority =1)
	public void switchPartner() throws InterruptedException {
		switchprofile s=new switchprofile(driver);
		s.switchProfile();
		s.switchToPartner();
		String actual =s.gettext();
		Assert.assertEquals("My View as Partner",actual);
		
	}
	@Test(priority =2)
	public void switchAgent() throws InterruptedException {
		switchprofile s=new switchprofile(driver);
		s.switchProfile();
		s.switchToAgent();
		String actual =s.gettext();
		Assert.assertEquals("My View as Agent",actual);
		
	}
	@Test(priority =3)
	public void switchManager() throws InterruptedException {
		switchprofile s=new switchprofile(driver);
		s.switchProfile();
		s.swithToManager();
		String actual =s.gettext();
		Assert.assertEquals("My View as Manager",actual);
	}
	
	@Test(priority =4)
	public void switchCustomer() throws InterruptedException {
		switchprofile s=new switchprofile(driver);
		s.switchProfile();
		s.switchToCustomer();
		String actual =s.gettext();
		Assert.assertEquals("Octowill range of Inheritance products customized for you",actual);
		
	}

}
