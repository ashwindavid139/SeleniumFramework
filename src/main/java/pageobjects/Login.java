package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public WebDriver driver;
	public WebDriverWait wait;

	public Login(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	By email = By.xpath("//input[@formcontrolname='username']");
	By login = By.xpath("//div[contains(@class,'authBtn')]");
	By errorMsg = By.xpath("//div[contains(@class,'notificationDesc')]");
	By OTP = By.xpath("//input[@type='text'][1]");
	By verify_Button = By.xpath("//span[@class='mdc-button__label']");

	// This is used to enter email
	public void enterEmail(String Email) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(email)));
		element.sendKeys(Email);
	}

//This is used to click login button
	public void clickLogin() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(login)));
		element.click();
	}

//This is used to get the error message 
	public String getErrorText() {

		String actual = driver.findElement(errorMsg).getText();
		return actual;
		// driver.findElement(errorMsg).getText();
	}

	public WebElement getErrorText1() {

		String actual = driver.findElement(errorMsg).getText();
		return getErrorText1();
		// driver.findElement(errorMsg).getText();
	}

//This is used to enter valid OTP in OTP field  
	public void OTP(String otp) {

		driver.findElement(OTP).sendKeys(otp);
	}

//This is used to click the verify button after OTP entered 
	public void verifyButton() {
		driver.findElement(verify_Button).click();

	}
}
