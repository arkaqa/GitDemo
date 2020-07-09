package Febbletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="email")
	private WebElement email;

	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement SignInBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	
	public void LoginPageTest(String un,String pwd) throws InterruptedException {
		email.sendKeys(un);
		password.sendKeys(pwd);
		SignInBtn.click();
		Thread.sleep(3000);
		
	}


}
