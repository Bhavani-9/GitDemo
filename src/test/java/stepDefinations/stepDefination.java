package stepDefinations;

import AllTopics.portalHomePage;
import Resources.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class stepDefination extends Base {
	
	@Given("^Initialize browser with chrome$")
	public void initialize_browser_with_chrome() throws Throwable {
	    
		driver = IntializeDriver();
	}

	@Given("^navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	 
		driver.get(arg1);
	}

	@Given("^click on login button to land on signin page$")
	public void click_on_login_button_to_land_on_signin_page() throws Throwable {
	  
		LandingPage lp = new LandingPage(driver);
		
		if(lp.getpopupBox().size()>0)
		{
			lp.popupBox().click();
		}
			
		 lp.getLogin().click();
	}

	@Then("^verify that user is successfully logged in or not$")
	public void verify_that_user_is_successfully_logged_in_or_not() throws Throwable {
	    
		portalHomePage php=new portalHomePage(driver);
		Assert.assertTrue(php.PortalPage().isDisplayed());
	}
	
	 @When("^user enters (.+) and (.+) and login$")
	    public void user_enters_and_and_login(String username, String password) throws Throwable {
		 LoginPage lop = new LoginPage(driver);
			lop.EmailId().sendKeys(username);
			lop.Password().sendKeys(password);
			lop.Login().click();
		 
	    }
	
	
	 @And("^close browsers$")
	    public void close_browsers() throws Throwable {
	      driver.quit();
	    }
	
	
}

	
	






