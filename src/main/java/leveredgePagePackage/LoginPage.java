package leveredgePagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import leveredgeBasePackage.BasePageClass;

public class LoginPage extends BasePageClass {
	//Page Factory
	@FindBy(id="userName")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="databaseName")
	WebElement database;
	
	//initializing the Page Object
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	//Actions

public void validateHomePage() {
	Assert.assertEquals(driver.getTitle(),"LeverEdge Login");
System.out.println("Validate Login Page Title");
}	
	
	

}
