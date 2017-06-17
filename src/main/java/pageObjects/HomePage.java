package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	
	@FindBy(id = "owner")
	WebElement inputName;
	
	@FindBy(xpath = "//button[@ng-click='setOwner(ownerName)']")
	WebElement buttonOk;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	//fill name input
	public void inputName(String name){
		inputName.sendKeys(name);
	}
	
	//click on button OK
	public void buttonOkClick(){
		buttonOk.click();
	}

}
