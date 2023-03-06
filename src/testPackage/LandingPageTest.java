package testPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagesPackage.LandingPage;

public class LandingPageTest extends BaseClass {
	
	LandingPage LP;
	
	public LandingPageTest() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@BeforeMethod
	public void launch() {
		initialization();
		LP = new LandingPage();
	}
	
	
	@Test
	public void Testcase1() {
		LP.searchProduct1(prop.getProperty("searchValue1"));
	}
	
	@Test
	public void Testcase2() {
		LP.searchProduct1(prop.getProperty("searchValue2"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	

}
