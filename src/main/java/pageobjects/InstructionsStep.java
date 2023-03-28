package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstructionsStep {

	
	public WebDriver driver;

	public InstructionsStep(WebDriver driver) {
		this.driver = driver;

	}
	By CreateInstruction=By.xpath("//span[contains(text(),'Create Instruction')]");
	By Instructions=By.xpath("//textarea[@placeholder='Instructions*']");
	By InstructionsDropdown=By.xpath("//mat-expansion-panel-header[@class='mat-expansion-panel-header mat-focus-indicator fx-row wd-100 center-center ng-tns-c79-109 ng-tns-c78-108 ng-star-inserted']");
	By RemoveInstruction=By.xpath("//span[contains(text(),'Remove')]");
	By proceedNext=By.xpath("//button[contains(@class,'proceedBtn')]");
	By SaveInstruction=By.xpath("//span[contains(text(),' Save ')]");
	By Back=By.xpath("//span[contains(text(),' Back ')]");
	By Selectfromthelist=By.xpath("//span[contains(text(),'Select from my list')]");
	By Select =By.xpath("(//span[contains(text(),' Select ')])[2]");
	By ConfirmYes=By.xpath("//span[contains(text(),'Yes')]");
	


public void Selectfromthelist() {

	driver.findElement(Selectfromthelist).click();
	driver.findElement(Select).click();	
	
}

public void RemoveInstruction() {
	
	driver.findElement(InstructionsDropdown).click();
	driver.findElement(RemoveInstruction).click();
	driver.findElement(ConfirmYes).click();
}

public void ProceedNext() {
	
	driver.findElement(proceedNext).click();
	
}

}
