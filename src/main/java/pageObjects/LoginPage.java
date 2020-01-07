package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
public WebDriver driver;


By email=By.xpath("//*[@type='email']");
By password=By.cssSelector("input[type='password']");
By login=By.xpath("//input[@type='submit']");



public LoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}



public WebElement EmailId()
{
	return driver.findElement(email);
}

public WebElement Password()
{
	return driver.findElement(password);
}

public WebElement Login()
{
	return driver.findElement(login);
}




}
