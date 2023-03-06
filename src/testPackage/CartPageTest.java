package testPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagesPackage.CartPage;
import pagesPackage.LandingPage;

public class CartPageTest extends BaseClass {

	CartPage CP;

	public CartPageTest() {
		// TODO Auto-generated constructor stub
		super();
	}
	@BeforeMethod
	public void launch() {
		initialization();
		CP = new CartPage();
	}
	
	
	@Test
	public void Testcase1() {
		CP.searchProduct1(prop.getProperty("cart"));
	}
}
