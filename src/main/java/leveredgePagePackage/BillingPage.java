package leveredgePagePackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import leveredgeBasePackage.BasePageClass;

public class BillingPage extends BasePageClass{
	@FindBy(xpath="(//*[contains(text(),'Billing')])[1]")
	WebElement billing;
	
	@FindBy(id="bill_salesman")
	WebElement selectSalesman;
	
	@FindBy(id="//*[@id='bill_beat']")
	WebElement selectBeat;
	
	@FindBy(xpath="//*[@class='rsu-grid-table']")
	List<WebElement> salesmanDetails = new ArrayList();
	
	////*[@id="rsu-popup-salesman_list-grid-area"]/table/tbody/tr[1]/td[1]
	
	//*[@id="rsu-popup-salesman_list-grid-area"]/table/tbody/tr[1]/td[1]

	
	public BillingPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void billingTab() {
	billing.click();
	for(WebElement val:salesmanDetails) {
		String salDetal = val.getText();
	
			}

		
	}
	

}
