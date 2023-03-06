package pagesPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;

public class LandingPage extends BaseClass {
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement Searchbox;
	
	@FindBy(xpath = "//span[text()='Sign in']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement searchBtn;
	
	public LandingPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public LoginPage LoginPage;
	
	public void searchProduct1(String searchValue1) {
		Searchbox.sendKeys(searchValue1);
		searchBtn.click();
		
	}
	
	public void searchProduct2(String searchValue2) {
		Searchbox.sendKeys(searchValue2);
		searchBtn.click();
	}
	
	public LoginPage Login() {
		return LoginPage;
	}
	
}
