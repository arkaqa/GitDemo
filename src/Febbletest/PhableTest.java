package Febbletest;


import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PhableTest extends TestBaseClass {

	
		
		
		@Test
		public void LoginTest() throws Exception {

			String Emailid = f.getPropertyValue("username");
			String Password = f.getPropertyValue("password");
			System.out.println(Emailid+"  "+Password);
			LoginPage login = new LoginPage(driver);
			login.LoginPageTest(Emailid, Password);
		for (int i = 0; i <= 4; i++) {
			String BoardName = f.getExcelValue("Sheet1", i, 0);
			BoardTest board = new BoardTest(driver);
			for (int j = 0; j <= 4; j++) {
				board.BoardsAddTest(BoardName);
				board.BoardsSwitchTest();
			ListsTest list=new ListsTest(driver);
		list.moveList();
		list.DeleteList();
		for(int k=0;k<=10;k++) {
			String ListName=f.getExcelValue("Sheet1",k, 1);
			for (int k1 = 0; k1 <= 4; k1++) {
				list.Addlisttest(ListName);				
	CardsTest card=new CardsTest(driver);
		card.TestCards();

	}

}
			}
		}
		}
}
			
		