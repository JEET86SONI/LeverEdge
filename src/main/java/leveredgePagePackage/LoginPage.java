package leveredgePagePackage;

import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(id="gologin")
	WebElement loginbtn;
	
	//initializing the Page Object
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	//Actions

public String validateHomePage() {
	String title = driver.getTitle();
	return title;
}	
	
public HomePage userLogin(String un,String pwd,String db) {
	username.sendKeys(un);
	password.sendKeys(pwd);
	database.sendKeys(db);
	JavascriptExecutor js  = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", loginbtn);
	return new HomePage();
}
	

}
