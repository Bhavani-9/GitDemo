package AllTopics;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class AssertionTitle extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void getStart() throws IOException
	{
		driver = IntializeDriver();
		log.info("Driver is initializing");
		driver.get(prop.getProperty("url"));
		log.info("page is navigating");
	}
	@Test
	public void validateAppTitle() throws IOException {
		
		LandingPage lp = new LandingPage(driver);

		 Assert.assertEquals(lp.text().getText(),"FEATURED COURSES");
		log.info("successfully printed text message");

	}
@AfterTest
public void getDown()
{
	driver.close();
	driver=null;
}
}
