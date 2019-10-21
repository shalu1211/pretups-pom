package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	By login_id = By.name("email");

	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getloginID()
	{
		return driver.findElement(login_id);
	}

}
