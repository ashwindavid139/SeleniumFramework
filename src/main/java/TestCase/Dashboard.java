package TestCase;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.Base;
import pageobjects.DashBoard;
import pageobjects.Login;
import pageobjects.MyProfile;

public class Dashboard extends Base {
	
	public WebDriver driver;
	MyProfile profile;
	DashBoard d;
	@BeforeTest
	public void launchapplication() throws IOException {

		driver = initializeDriver();
		driver.get("https://staging.octowill.com/app-v2/login");
		profile = new MyProfile(driver);
	    d = new DashBoard(driver);
		
	}

//	@AfterTest
//	public void teardown() {
//		driver.close();
//	}

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
	public void Dashboard() throws InterruptedException {
		
		d.DashBoard();
		
	}

	@Test(priority =2)
	public void MyData() throws InterruptedException {
		
		d.MyData();
		
		driver.navigate().back();
		
	}

	

}
