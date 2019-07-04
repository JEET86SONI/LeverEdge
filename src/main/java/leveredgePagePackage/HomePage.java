package leveredgePagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import leveredgeBasePackage.BasePageClass;

public class HomePage extends BasePageClass {
	//page Factory for Home Page element
	@FindBy(id="bs_Close")
	WebElement closeBtn;
	
	@FindBy(xpath = "(//*[contains(text(),'Confirm')])[4]")
	WebElement confirmBtn;
	
	@FindBy(xpath="//*[@class='l-btn l-btn-small']//span[contains(text(),'No')]")
	WebElement NoBtn;
	
	@FindBy(xpath="(//*[contains(text(),'Distribution')])[1]")
	WebElement distribution;
	
	@FindBy(xpath="//*[@class='rsu-transaction-menus transcation-Div menu-item']//*[contains(text(),'Transaction')]")
	WebElement transaction;
	
	@FindBy(xpath="(//*[contains(text(),'Billing')])[1]")
	WebElement billing;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String homePageTitle() {
		String  homePageTitle = driver.getTitle();
		return homePageTitle;
	}
	
	public void welcomeScreen() {
		closeBtn.click();
	}
	
	public void confirm() {
		String title = confirmBtn.getText();
		NoBtn.click();
		}
	
	public void distribution() throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.clickAndHold(distribution);
		action.clickAndHold(transaction);
		action.click(billing);
		
	
	}
	
}
