package pagesPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;

public class LoginPage extends BaseClass {

	
	public LandingPage LandingPage;
	
	@FindBy(id = "user_email")
	WebElement email;
	
	@FindBy(id = "user_password")
	WebElement password;
	
	@FindBy(name = "commit")
	WebElement loginBtn;

	
	public LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}


	public HomePage login(String property, String property2) {
		// TODO Auto-generated method stub
		
		return null;
	}


	public HomePage login1(String property, String property2) {
		// TODO Auto-generated method stub
		return null;
	}

	public void login() {
		email.sendKeys("emailId");
		password.sendKeys("password");
	}
	

public LandingPage Login() {
		
		loginBtn.click();
		return LandingPage;
	}
}
