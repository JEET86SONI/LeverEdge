package org.leveredgeTestCases;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.qa.leveredge.utility.ReadCapcha;
import org.testng.annotations.Test;

import leveredgeBasePackage.BasePageClass;
import leveredgePagePackage.HomePage;
import leveredgePagePackage.LoginPage;

public class HomePageTest extends BasePageClass {
	LoginPage loginpage;
	HomePage homepage;
	ReadCapcha  capchaImg;
	
	public HomePageTest() {
		super();
	}

	@Test(priority = 1)
	public void initialize() {
		setUp();
		loginpage = new LoginPage();
		homepage = new HomePage();
		capchaImg = new ReadCapcha();
		loginpage.userLogin(prop.getProperty("username"),prop.getProperty("password"), prop.getProperty("database"));
		}
	
//	@Test(priority = 1)
//	public void verifyHomePage() {
//		String hometitle = homepage.homePageTitle();
//		System.out.println(hometitle);
//		Assert.assertEquals(hometitle, "LeverEdge R19.5.0 - U1","HomePage Title Not Matched");
//	}
	@Test(priority = 2)
	public void verifyWelcomeScreen() throws Exception {
		
//		try {
//			capchaImg.takeImage();
//		} catch (TesseractException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		homepage.welcomeScreen();
	}
	@Test(priority = 3)
	public void verifyConfirmScreen() {
		homepage.confirm();
	
	}
	@Test(priority = 4)
	public void verifyBillingTab() throws InterruptedException {
		homepage.distribution();
	
	}
	
//	@AfterMethod
//	public void close() {
//		tearDown();
//	}
}
