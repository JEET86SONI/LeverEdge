package org.leveredgeTestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import leveredgeBasePackage.BasePageClass;
import leveredgePagePackage.LoginPage;

public class LoginPageTest extends BasePageClass {

	private LoginPage loginpage;
	
	@BeforeClass
	public void init() {
		loginpage = new LoginPage();
	}
	
	@Test(priority = 0)

	public void loginPage() {
		loginpage.validateHomePage();
	}
	
}
