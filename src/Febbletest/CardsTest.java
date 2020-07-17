package Febbletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class CardsTest extends TestBaseClass {

	@FindBy(xpath = "//select[@class='containers-Board-Board__boardOptions--2n_6y']")
	private WebElement DropdownClick;

	@FindBy(xpath = "//body//option[16]")
	private WebElement MedicalBoard;

	@FindBy(xpath = "(//div[@role='button' and text()='Add a card...'])[1]")
	private WebElement AddCardsABCD;
	private WebElement AddCards;
	
	
	@FindBy(id = "noty_layout__bottomRight")
	private WebElement AddCardMessage;
	
	@FindBy(xpath = "(//textarea)[3]")
	private WebElement EditCard;
	

	@FindBy(xpath = "//div[contains(@class,'components-Card-Card')]/img[@alt='delete']")
	private WebElement DeleteCard;

	@FindBy(xpath = "//div[@role='alert']/div")
	private WebElement DeleteCardMessage;

	

	public CardsTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void TestCards() {
		DropdownClick.click();
		MedicalBoard.click();
		AddCards.click();
		System.out.println(AddCardMessage.getText());
		EditCard.sendKeys("TestAutomation");
		DeleteCard.click();
		System.out.println(DeleteCardMessage.getText());

	}

}
