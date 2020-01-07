package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
public WebDriver driver;


By signin=By.cssSelector("a[href*='sign_in']");
By text=By.xpath("//*[@id=\"content\"]/div/div/h2");
By navigation=By.xpath("//a[contains(text(),'Contact')]");
By popup=By.xpath("//button[text()='NO THANKS']");



public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}



public WebElement getLogin()
{
	return driver.findElement(signin);
}

public WebElement text()
{
	return driver.findElement(text);
}

public WebElement navigatePage()
{
	return driver.findElement(navigation);
}

public List<WebElement> getpopupBox() 
{
	return driver.findElements(popup);
}

public WebElement popupBox()
{
	return driver.findElement(popup);
}


}
