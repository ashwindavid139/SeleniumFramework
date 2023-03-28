package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menus {

	public WebDriver driver;

	public Menus(WebDriver driver) {
		this.driver = driver;

	}

	By Inheritance = By.xpath("//div[contains(text(),'Inheritance')]");
	By Create = By.xpath("(//div[contains(text(),' Create ')])[1]");

	public void Inheritance() {
		driver.findElement(Inheritance).click();

	}

	public void Create() {
		driver.findElement(Create).click();

	}

}
