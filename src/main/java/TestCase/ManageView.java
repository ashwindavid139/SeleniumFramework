package TestCase;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.Base;
import pageobjects.Login;
import pageobjects.Manage;

public class ManageView extends Base {
	
	public  WebDriver driver;
	Manage manage;
	@BeforeTest
	public void launchapplication() throws IOException {
		
		driver=initializeDriver();
		driver.get("https://staging.octowill.com/app-v2/login");
		manage=new Manage(driver);
	}
	

	@AfterTest
	public void teardown() {
        driver.close();
	}
	
	@Test(priority = 0)
	public void loginPositive() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		Login login = new Login(driver);
		login.enterEmail("qa+testing@octowill.com");
		login.clickLogin();
		login.OTP("665822");
		login.verifyButton();
		String actual = login.getErrorText();
		Assert.assertEquals("Logged In Successfully", actual);

	}
	
	

	
	@Test(priority = 1)
	public void Mybeneficiary() throws InterruptedException {
//		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement menu= driver.findElement(By.xpath("//div[text()='Manage']"));
//		wait.until(ExpectedConditions.elementToBeClickable(menu));
		manage.ManageMenu();
		manage.MyBeneficiary();
			
	}
	
	@Test(priority = 2)
	public void MyGuardian() {
		
		manage.MyGuardian();
		
	}
	@Test(priority = 3)
	public void MyWitness() {
		manage.MyWitness();
		
	}
	
	@Test(priority = 4)
	public void MyExecutor() {
		
		manage.MyExecutor();
	}
	
	@Test(priority = 5)
	public void MyTrustedPerson() {
		
		manage.MyTrusted();
	}
	
	@Test(priority = 5)
	public void MyAsset() {
		
		manage.MyAsset();
	}
	@Test(priority = 6)
	public void MyJointcustomer() {
		
		manage.MyJointcustomer();
	}

}
