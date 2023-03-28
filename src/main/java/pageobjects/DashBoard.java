package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoard {
	
	public WebDriver driver;

	public DashBoard(WebDriver driver) {
		this.driver = driver;
		

	}
	
	By Dashboard=By.xpath("//div[text()='Dashboard']");
	By MyData=By.xpath("//div[text()='My Data']");
	By Create=By.xpath("//div[text()='Create']");

	
	public void DashBoard() {

		driver.findElement(Dashboard).click();
	}
	public void MyData() {
		
		driver.findElement(MyData).click();
	}
    public void Create() throws InterruptedException {
	
		driver.findElement(Create).click();
	}
}
