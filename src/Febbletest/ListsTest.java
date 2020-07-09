package Febbletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListsTest extends TestBaseClass {
	@FindBy(xpath = "//div[text()='Add list...']")
	private WebElement AddList;

	@FindBy(xpath = "//input[@placeholder='List title']")
	private WebElement ListTitle;

	@FindBy(xpath = "//button[contains(text(),'Add')]")
	private WebElement AddBtn;

	@FindBy(xpath = "//img[@class='containers-List-List__deleteIcon--11pB-']")
	private WebElement DeleteBtn;

	@FindBy(xpath = "//div[contains(@id,'bottomRight')]")
	private WebElement DeleteMsg;

	@FindBy(xpath = "//select[@class='containers-Board-Board__boardOptions--2n_6y']")
	private WebElement DropdownClick;

	@FindBy(xpath = "//body//option[16]")
	private WebElement MedicalBoard;

	@FindBy(xpath = "(//div[contains(@class,'NWAZB')]/div/div/div)[1]")
	private WebElement MoveDoctors;

	@FindBy(xpath = "(//div[contains(@class,'NWAZB')]/div/div/div)[4]")
	private WebElement MoveStaffs;

	public ListsTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Addlisttest(String title) {
		AddList.click();
		ListTitle.sendKeys(title);
		AddBtn.click();
	}

	public void moveList() throws InterruptedException {
		DropdownClick.click();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.clickAndHold(MoveDoctors).moveToElement(MoveStaffs).release().build().perform();

	}

	public void DeleteList() {
		DeleteBtn.click();
		System.out.println(DeleteMsg.getText());

	}

}
