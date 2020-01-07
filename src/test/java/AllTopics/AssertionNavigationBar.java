package AllTopics;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class AssertionNavigationBar extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@Test
	public void validateAppNavBar() throws IOException
	{
		driver = IntializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
System.out.println("This is Bhisetti");
System.out.println("This is Bhisetti1");

System.out.println("This is Bhisetti123");
System.out.println("This is Bhisetti456");
System.out.println("This is Bhisetti2");
		 Assert.assertTrue(lp.navigatePage().isDisplayed());
		 log.info("Successfully navigated");
	}
	@AfterTest
	public void getDown()
	{
		driver.close();
		driver=null;
	}
}
