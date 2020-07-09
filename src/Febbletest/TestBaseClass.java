package Febbletest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class TestBaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver=new ChromeDriver();
	public FileLib f = new FileLib();

	@BeforeClass
	public void openBrowserTest() throws IOException {

		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void LoginAppTest() throws IOException {
		String Url = f.getPropertyValue("url");
		String DisplayName = f.getPropertyValue("displayname");
		String un = f.getPropertyValue("username");
		String pwd = f.getPropertyValue("password");
		driver.get(Url);
		SignupTest st = new SignupTest(driver);
		st.SignUpPageTest(DisplayName, un, pwd);
	}

	
	@AfterClass
	public void TearDown() {
		driver.close();
	}

}
