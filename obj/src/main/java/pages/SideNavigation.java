package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideNavigation {

	WebDriver driver;

	public SideNavigation(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[text()='CRM']")
	WebElement CRM;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Contact')]")
	WebElement AddContact;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'List Contact')]")
	WebElement ListContact;

	@FindBy(how = How.NAME, using = "name")
	WebElement CustomerBox;

	public void ClickAddContact() {
		CRM.click();
		AddContact.click();

	}

   public void ClickListContact() {
		CRM.click();
		ListContact.click();

	}


}

