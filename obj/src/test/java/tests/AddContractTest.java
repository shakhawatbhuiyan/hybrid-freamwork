package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.ContactPage;
import pages.DashboardPage;
import pages.LoginClass;
import util.BrowserFactory;

public class AddContractTest {
	@Test
	public void AddingContact() {
		WebDriver driver = BrowserFactory.startBrowser();

		LoginClass loginwebsite = PageFactory.initElements(driver, LoginClass.class);
		loginwebsite.login();

		String expectedTittle = "Dashbord- TechFios Test Application - Billing";
		String actualTittle = loginwebsite.getPageTittle();
		Assert.assertEquals(expectedTittle, actualTittle);

		DashboardPage Dashboard = PageFactory.initElements(driver, DashboardPage.class);
		Dashboard.ClickAddContact();

		ContactPage Contact = PageFactory.initElements(driver, ContactPage.class);
		Contact.FillupContactForm();

		driver.close();
		driver.quit();
	}

}
