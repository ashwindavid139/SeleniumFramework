package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExecutorStep {
	public WebDriver driver;

	public ExecutorStep(WebDriver driver) {
		this.driver = driver;

	}
	
	By CreateExecutor=By.xpath("//span[contains(text(),'Create Primary Executor')]");

}
