package TestCase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.Base;
import pageobjects.Login;
import pageobjects.MyProfile;

public class Menus1 extends Base {
	
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
	
	
	@Test(priority =0)
	public void loginPositive(){
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Login login = new Login(driver);
		login.enterEmail("qa+testing@octowill.com");
		login.clickLogin();
		login.OTP("665822");
		login.verifyButton();
		String actual = login.getErrorText();
		Assert.assertEquals("Logged In Successfully", actual);
		
	}
	
	
	@Test
	public void Dashboard() throws InterruptedException {
		
		Dashboard m=new Dashboard();
		m.Dashboard();
	}

}
