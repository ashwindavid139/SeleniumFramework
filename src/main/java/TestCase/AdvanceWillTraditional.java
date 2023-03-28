package TestCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.Base;
import pageobjects.Assetpage;
import pageobjects.CreateBeneficiaryStep;
import pageobjects.CreateCategoryPage;
import pageobjects.CreateProductsPage;
import pageobjects.CreateSubcategoryPage;
import pageobjects.ExistingWillStep;
import pageobjects.InstructionsStep;
import pageobjects.Login;
import pageobjects.Menus;
import pageobjects.PaymentSummaryPage;
import pageobjects.PreviewPage;
import pageobjects.ReviewStep;
import pageobjects.Step1Page;
import pageobjects.WitnessStep;

public class AdvanceWillTraditional extends Base {

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
	    ExistingWillStep existing;
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
	    existing=new ExistingWillStep(driver);
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
		create.CreateAdvanceWill();

	}
	
	@Test(priority = 3)
	public void Step1() throws InterruptedException {
		
		step1.SelectJointCustomer();
		step1.ProceedAfterjoint();
		
		
	}
	
	@Test(priority=4)
	public void Existngwill() {
		existing.ExistingWill();
		
	}
	
	
}
