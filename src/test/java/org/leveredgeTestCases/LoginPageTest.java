package org.leveredgeTestCases;

import org.testng.Assert;
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

	public void validateTitle() {
		String title = loginpage.validateHomePage();
		Assert.assertEquals(title, "LeverEdge Login");
	}
	
	@Test(priority = 1)
	public void validatelogin() {
		loginpage.userLogin(prop.getProperty("username"), prop.getProperty("password"),prop.getProperty("database"));
	}
	
}
