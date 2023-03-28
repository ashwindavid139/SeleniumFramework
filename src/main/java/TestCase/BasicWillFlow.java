package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.Base;
import pageobjects.Assetpage;
import pageobjects.CreateBeneficiaryStep;
import pageobjects.CreateCategoryPage;
import pageobjects.CreateProductsPage;
import pageobjects.CreateSubcategoryPage;
import pageobjects.InstructionsStep;
import pageobjects.Login;
import pageobjects.Menus;
import pageobjects.PaymentSummaryPage;
import pageobjects.PreviewPage;
import pageobjects.ReviewStep;
import pageobjects.Step1Page;
import pageobjects.WitnessStep;

public class BasicWillFlow extends Base {
	public WebDriver driver;
	Menus menu;
	CreateCategoryPage category;
	CreateSubcategoryPage subcategory;
	CreateProductsPage create;
	Step1Page step1;
	CreateBeneficiaryStep Ben;
	Assetpage asset;
	InstructionsStep instruction;
	    WitnessStep witness;
	    ReviewStep review;
	    PreviewPage preview;
	    PaymentSummaryPage summary;
	    

	@BeforeTest
	public void launchapplication1() throws IOException {

		driver = initializeDriver();
		driver.get("https://staging.octowill.com/app-v2/login");
		menu = new Menus(driver);
		category = new CreateCategoryPage(driver);
		subcategory = new CreateSubcategoryPage(driver);
		create = new CreateProductsPage(driver);
		step1 = new Step1Page(driver);
		Ben=new CreateBeneficiaryStep(driver);
	    asset=new Assetpage(driver);
	    instruction=new InstructionsStep(driver);
	    witness=new WitnessStep(driver);
	    review=new ReviewStep(driver);
	    preview=new PreviewPage(driver);
	    summary=new PaymentSummaryPage(driver);
	}

	@AfterTest
	public void teardown1() {
        driver.close();
	}

	@Test(priority = 0)
	public void loginPositive() throws InterruptedException {
		Login login = new Login(driver);
		login.enterEmail("qa+testing@octowill.com");
		login.clickLogin();
		login.OTP("665822");
		login.verifyButton();
		String actual = login.getErrorText();
		Assert.assertEquals("Logged In Successfully", actual);

	}

	@Test(priority = 1)
	public void CreateMenuNavigation() throws InterruptedException {
		menu.Inheritance();
		menu.Create();

	}

	@Test(priority = 2)
	public void Selectproducts() throws InterruptedException {

		category.ForTraditionalAsset();
		subcategory.ConventionalWill();

	}

	@Test(priority = 3)
	public void CreateBaseWill() {

		create.CreateBaseWill();
	}

	@Test(enabled =false)
	public void Personaldetails() throws InterruptedException {
		 
		step1.PersonalDetails1("Apple Test");
		step1.PersonalDetails2("21541541");
	}

	@Test(enabled =false)
	public void Identification() throws InterruptedException {
		step1.Identification("124577");
	}

	@Test(enabled =false)
	public void AddressForCommunication() throws InterruptedException {
		step1.AddressFOrCommunication();
		String actual = step1.successmsg();
		Assert.assertEquals("Updated Successfully", actual);
		step1.proceednext();
	}
	
	@Test(priority = 4)
	public void proceedNext() throws InterruptedException {
		Thread.sleep(10000);
		step1.proceednext();
	}
	
	@Test(priority=5)
	public void RemoveBeneficiary() throws InterruptedException {
		
		
	//	Ben.RemoveBeneficiary();
	//	Thread.sleep(5000);
		Ben.Selectfromthelist();
		Thread.sleep(5000);
		Ben.Benproceednext();
			
	}
	
	@Test(priority=6)
	public void BasicDistribution() {
		asset.BasicDistribution();
		asset.ProceedNext();
		
	}
	 @Test(priority=7)
	 public void InsructionStep() {
		
		 instruction.Selectfromthelist();
		 instruction.ProceedNext();
	 }
	 
	 @Test(priority=8)
	 public void Witnessstep() throws InterruptedException {
		 Thread.sleep(3000);
		 witness.SelectFromthelist();
		 witness.ProccedNext();
		
	 }
	 @Test(priority=9)
	 public void Reviewstep() {
		 
		 review.ProceedNext();
		 
	 }
	 @Test(priority=10)
	 public void Previewstep() {
		 preview.CheckBox();
		 preview.ProceedToCart();
		
	 }
	 
	 @Test(priority=11)
	public void Paymentsummary() {
		 summary.WalletCredit();
		 String actual = summary.SuccessMsg();
			Assert.assertEquals("Order Placed Successfully", actual);
		 
	 }
	 
	 
	
	

}
