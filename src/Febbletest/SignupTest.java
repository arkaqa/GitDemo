package Febbletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupTest {

	@FindBy(xpath = "//button[2]/span[text()='Sign-Up']")
	private WebElement Signuptab;

	@FindBy(name = "displayName")
	private WebElement displayName;

	@FindBy(name = "email")
	private WebElement emailid;

	@FindBy(name = "password")
	private WebElement Password;

	@FindBy(xpath = "(//span[@class='MuiButton-label'])[3]")
	private WebElement SignupBtn;

	public SignupTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void SignUpPageTest(String displayname, String un, String pwd) {
		Signuptab.click();
		displayName.sendKeys(displayname);
		emailid.sendKeys(un);
		Password.sendKeys(pwd);
		SignupBtn.click();

	}

}
