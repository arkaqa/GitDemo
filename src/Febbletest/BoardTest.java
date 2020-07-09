package Febbletest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BoardTest extends TestBaseClass {
	@FindBy(xpath = "//select[contains(@class,'containers')]")
	private WebElement DropdownTab;

	@FindBy(xpath = "//select/option[.='Add a board']")
	private WebElement AddBoardClick;

	@FindBy(xpath = "//input[@placeholder='Board name']")
	private WebElement BoardName;

	@FindBy(xpath = "//button[contains(text(),'Add')]")
	private WebElement BoardaddClick;

	@FindBy(xpath = "//option[@name='Medical Board']")
	private WebElement MedicalBoardClick;

	@FindBy(xpath = "//div[@role='alert']/div/div")
	private WebElement SwitchAlertMsg;

	public BoardTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void BoardsAddTest(String bn) {
		DropdownTab.click();
		AddBoardClick.click();
		BoardName.sendKeys(bn);
		BoardaddClick.click();

	}

	public void BoardsSwitchTest() {
		DropdownTab.click();
		MedicalBoardClick.click();
		System.out.println(SwitchAlertMsg.getText());
		List<WebElement> List = driver.findElements(By.xpath("//option[@name]"));
		for (int i = 0; i < List.size(); i++) {
			System.out.println(List.get(i).getText());

		}
		
		

	}

}
