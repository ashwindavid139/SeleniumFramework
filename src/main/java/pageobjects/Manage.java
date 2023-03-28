package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Manage {
	
	public WebDriver driver;

	public Manage(WebDriver driver) {
		this.driver = driver;

	}
	
	By ManageMenu=By.xpath("//div[text()='Manage']");
	By Mydatasets=By.xpath("(//div[text()=' My Data Sets '])[1]");
	By ViewBeneficiary=By.xpath("(//span[contains(text(),'View')])[1]");
	By ViewGuardian=By.xpath("(//span[contains(text(),'View')])[2]");
	By ViewWitness=By.xpath("(//span[contains(text(),'View')])[3]");
	By ViewExecutor=By.xpath("(//span[contains(text(),'View')])[4]");
	By ViewTrustedPerson =By.xpath("(//span[contains(text(),'View')])[5]");
	By ViewAssets=By.xpath("(//span[contains(text(),'View')])[6]");
	By ViewCustomer=By.xpath("(//span[contains(text(),'View')])[7]");
	By Title=By.xpath("//div[contains(@class,'overAllTitle')]");
	By BackButton =By.xpath("//span[contains(text(),'Back')]");
	By ViewJointcustomer=By.xpath("(//span[contains(text(),'View')])[6]");




public void ManageMenu() {
	
	driver.findElement(ManageMenu).click();
	driver.findElement(Mydatasets).click();

}

public void MyBeneficiary() {
	driver.findElement(ViewBeneficiary).click();
	driver.findElement(BackButton).click();
	
}

public void MyBeneficairyview() {
	driver.findElement(ViewBeneficiary).click();
}

public void MyGuardian() {
	
	driver.findElement(ViewGuardian).click();
	driver.findElement(BackButton).click();
}

public void MyWitness() {
	
	driver.findElement(ViewWitness).click();
	driver.findElement(BackButton).click();
}

public void MyExecutor() {
	driver.findElement(ViewExecutor).click();
	driver.findElement(BackButton).click();
}
public void MyTrusted() {
	
	driver.findElement(ViewTrustedPerson).click();
	driver.findElement(BackButton).click();
}

public void MyAsset() {
	
	driver.findElement(ViewAssets).click();
	driver.findElement(BackButton).click();
}

public void MyJointcustomer() {
	driver.findElement(ViewJointcustomer).click();
	driver.findElement(BackButton).click();
}
}

