package testPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagesPackage.HomePage;
import pagesPackage.LoginPage;

public class HomePageTest extends BaseClass {

//	LoginPage loginPage;
//	HomePage homePage;
//	
//	public HomePageTest() {
//		// TODO Auto-generated constructor stub
//		super();
//	}
//	
//	@BeforeMethod
//	public void setUp() {
//		initialization();
//		loginPage = new LoginPage();
//		homePage =  loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
//	}
//	
//	
//	@Test
//	public void verifyHomePageTitle() {
//		String homePageTitle = homePage.verifyHomePageTitle();
//		Assert.assertEquals(homePageTitle, "Home Page Title is not matched");
//	}
//	
//	@Test
//	public void verifyUserNameTest() {
//		boolean name = homePage.verifyLoggedInUserName();
//		Assert.assertTrue(name);
//	}
//	
//	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}

}
