package pagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;

public class CartPage extends BaseClass {

	@FindBy(xpath = "//span['nav-cart-count']")
	WebElement Searchbox;
	
	public CartPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchProduct1(String cart) {
		Searchbox.sendKeys(cart);
	}
	
}
