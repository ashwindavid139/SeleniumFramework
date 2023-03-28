package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateSubcategoryPage {

	public WebDriver driver;

	public CreateSubcategoryPage(WebDriver driver) {
		this.driver = driver;

	}

	By eNomination = By.xpath("//span[text()=' e-Nomination ']");
	By ConventionalWill = By.xpath("//span[text()=' Conventional Will ']");
	By IslamicWill = By.xpath("//span[text()=' Islamic (Wasiyyah) ']");
	By HibahAmanah = By.xpath("//span[text()=' Hibah Amanah ']");

	public void Enomination() {

		driver.findElement(eNomination).click();
	}

	public void ConventionalWill() {

		driver.findElement(ConventionalWill).click();
	}

	public void IslamicWill() {

		driver.findElement(IslamicWill).click();
	}

	public void HibahAmanah() {

		driver.findElement(HibahAmanah).click();
	}

}
