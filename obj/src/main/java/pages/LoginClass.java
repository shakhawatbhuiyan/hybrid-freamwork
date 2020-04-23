package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import util.BrowserFactory;

public class LoginClass {
	WebDriver driver;

	public LoginClass(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "username")
	WebElement username;

	@FindBy(how = How.ID, using = "password")
	WebElement passwoard;

	@FindBy(how = How.NAME, using = "login")
	WebElement signingButton;

	public void login() {
		username.sendKeys("techfiosdemo@gmail.com");
		passwoard.sendKeys("abc123");
		signingButton.click();
	}

	public String getPageTittle() {
		return driver.getTitle();
	}
}
