package AllTopics;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends Base {

	@Test(dataProvider = "getData")
	public void basePageNavigation(String emailid, String password) throws IOException {
		driver = IntializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		
		lp.getLogin().click();

		LoginPage lop = new LoginPage(driver);
		lop.EmailId().sendKeys(emailid);
		lop.Password().sendKeys(password);
		lop.Login().click();

	}

	@AfterTest
	public void getDown() {
		driver.close();
		driver = null;
	}

	@DataProvider
	public Object[][] getData() {
		// [2] ide emailid and password kosam
		// [2] ide okati nonrestricted[0] inkoti restricted[1]
		Object[][] data = new Object[2][2];
		data[0][0] = "nonrestricteduser.com";
		data[0][1] = "12345";

		data[1][0] = "restricteduser.com";
		data[1][1] = "5678";

		return data;

	}

}
