package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginClass;
import util.BrowserFactory;

public class LoginTest {
	@Test
	public void TechfiosLogin() {
		WebDriver driver = BrowserFactory.startBrowser();
		LoginClass loginwebsite = PageFactory.initElements(driver, LoginClass.class);
		loginwebsite.login();
		driver.close();
		driver.quit();

	}
}
