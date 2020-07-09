package Febbletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath = "//a[@class='logout' and @id='logoutLink']")
	private WebElement LogoutLink;

	@FindBy(id = "container_tasks")
	private WebElement TaskMenu;

	

	public Homepage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		}

		public WebElement getLOGOUTLINK() {
		 return LogoutLink;
		}

		public WebElement getTaskMenu() {
		 return TaskMenu;
		}
		}


